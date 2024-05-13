package thursday_lab;

class MyThread extends Thread 
{
	@Override
    public void run() {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }
}

public class ThreadPriorityExample 
{
    public static void main(String[] args) 
    {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        MyThread thread4 = new MyThread();
        MyThread thread5 = new MyThread();

        // Set priorities for the threads
        thread3.setPriority(5);
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.MAX_PRIORITY); // Priority 10
        thread4.setPriority(2);
        thread5.setPriority(4);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
