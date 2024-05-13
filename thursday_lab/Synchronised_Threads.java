package thursday_lab;

class Synchronised_Threads {
    private int[] buffer;
    private int size;
    private int count;

    public Synchronised_Threads(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.count = 0;
    }

    public synchronized void produce(int item) throws InterruptedException 
    {
        while (count == size) 
        {
            System.out.println("Buffer is full. Producer is waiting...");
            wait();
        }

        buffer[count] = item;
        count++;
        System.out.println("Produced: " + item);
        notify();  // Notify the consumer that data is available
    }

    public synchronized void consume() throws InterruptedException 
    {
        while (count == 0)
        {
            System.out.println("Buffer is empty. Consumer is waiting...");
            wait();
        }

        int item = buffer[count - 1];
        count--;
        System.out.println("Consumed: " + item);
        notify();  // Notify the producer that space is available
    }
}