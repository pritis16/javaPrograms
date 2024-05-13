package thursday_lab;

class MyThreads extends Thread 
{
    @Override
    public void run() 
    {
        System.out.println(Thread.currentThread().getName()+" is running");
    }
}
class RunningThread 
{
      public static void main(String[] args)
      {
          try {
        	  MyThreads thread0 = new MyThreads();
        	  MyThreads thread1 = new MyThreads();
              MyThreads thread2 = new MyThreads();
              MyThreads thread3 = new MyThreads();
              MyThreads thread4 = new MyThreads();
              
              thread0.start();	//start the thread
              thread1.sleep(0);	//thread is in sleep mode or waiting state
              thread2.start();
              thread3.sleep(0);
              thread4.start();
          }
          catch(InterruptedException ie)
          {
        	  System.out.println(ie.getMessage());
          }
          
      }
}
