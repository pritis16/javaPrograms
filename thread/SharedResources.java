package thread;

class SharedResources 
{
    private int counter = 0;

    // only one thread can access a shared resource at a time 
    public synchronized void increment() 
    {
        counter++;
    }

    public int getCounter() 
    {
        return counter;
    }
}
