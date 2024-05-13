package thread;

public class SyncDemo 
{
    public static void main(String[] args) throws InterruptedException 
    {
        SharedResources sharedResource = new SharedResources();

        // Creating two threads that share the same resource
        MyThreads thread1 = new MyThreads(sharedResource);
        MyThreads thread2 = new MyThreads(sharedResource);

        // Start the threads
        thread1.start();       
        thread2.start();

        thread1.join();			// Wait for both threads to finish
        thread2.join();			//waits for them to finish before printing the final counter value.

        // Print the final counter value
        System.out.println("Counter: " + sharedResource.getCounter());
    }
}