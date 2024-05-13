package thursday_lab;

class Consumer extends Thread 
{
    public Synchronised_Threads sharedResource;

    public Consumer(Synchronised_Threads sharedResource) 
    {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                sharedResource.consume();
                Thread.sleep(1500); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
