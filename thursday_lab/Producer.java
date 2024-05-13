package thursday_lab;

class Producer extends Thread 
{
    private Synchronised_Threads sharedResource;

    public Producer(Synchronised_Threads sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                sharedResource.produce(i);
                Thread.sleep(1000); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

