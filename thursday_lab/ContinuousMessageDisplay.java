package thursday_lab;

class DisplayThread extends Thread {
    private String message;

    public DisplayThread(String message) {
        this.message = message;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(1000); // Adjust the sleep duration as needed
            }
        } 
        catch (InterruptedException e) {
        	//System.out.println(e.getMessage());
        }
    }
}

public class ContinuousMessageDisplay {
    public static void main(String[] args) 
    {
        try 
        {
            // Create two threads with different messages
            DisplayThread thread1 = new DisplayThread("Thread 1: Hello!");
            DisplayThread thread2 = new DisplayThread("Thread 2: Welcome!");

            // Start the threads
            thread1.start();
            thread2.start();

            // Wait for the user to press Ctrl+C
            System.out.println("Press Ctrl+C to exit...");
            while (true) {
                // Keep the main thread alive
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) 
        {
        	//System.out.println(e.getMessage());
        	// Main thread interrupted, exit the program
        }
    }
}
