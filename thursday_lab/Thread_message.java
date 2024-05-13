package thursday_lab;

public class Thread_message {

	public static void main(String[] args) 
	{
        // Create two threads with different messages
		DisplayMessage thread1 = new DisplayMessage("Thread 1: Hello!");
		DisplayMessage thread2 = new DisplayMessage("Thread 2: Welcome to java programming....");

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for user to press Ctrl+C to terminate the program
        System.out.println("Press Ctrl+C to Exit...");
        try 
        {
        	Thread.sleep(1000);
        } 
        catch (InterruptedException e) 
        {
        	//System.out.println(e.getMessage());
        }
	}

}
