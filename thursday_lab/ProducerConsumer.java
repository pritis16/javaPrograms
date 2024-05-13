package thursday_lab;

public class ProducerConsumer 
{
    public static void main(String[] args) 
    {
      Synchronised_Threads sharedResource = new Synchronised_Threads(2);

        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        producer.start();
        consumer.start();
    }
}
