package thread;

class MyThreads extends Thread 
{
    private SharedResources sharedResource;

    public MyThreads(SharedResources sharedResource) 
    {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() 
    {
        for (int i = 0; i < 100000; i++) 
        {
            sharedResource.increment();
        }
    }
}
