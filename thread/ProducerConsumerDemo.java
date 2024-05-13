package thread;

import java.util.LinkedList;

import thread.Consumer;
import thread.Producer;
class SharedResource 
{
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity;

    public SharedResource(int capacity) 
    {
        this.capacity = capacity;
    }

    public void produce(int item) throws InterruptedException 
    {
        synchronized (this) 
        {
            while (buffer.size() == capacity) 
            {
                System.out.println("Buffer is full. Producer is waiting...");
                wait();
            }

            buffer.add(item);
            System.out.println("Produced: " + item);
            notify();  // Notify the consumer that data is available
        }
    }

    public void consume() throws InterruptedException 
    {
        synchronized (this) 
        {
            while (buffer.isEmpty()) 
            {
                System.out.println("Buffer is empty. Consumer is waiting...");
                wait();
            }

            int item = buffer.removeFirst();
            System.out.println("Consumed: " + item);
            notify();  // Notify the producer that space is available
        }
    }
}

class Producer extends Thread 
{
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) 
    {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) 
        {
            try {
                sharedResource.produce(i);
                Thread.sleep(1000); 
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread
{
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) 
    {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) 
        {
            try {
                sharedResource.consume();
                Thread.sleep(1500); 
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerDemo
{
    public static void main(String[] args) 
    {
        SharedResource sharedResource = new SharedResource(2);

        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        producer.start();
        consumer.start();
    }
}
