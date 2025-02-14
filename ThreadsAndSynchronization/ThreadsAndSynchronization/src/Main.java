class SharedResources {
    private volatile int count = 0;
    public synchronized void increment(){
        count++;
    }
    public synchronized int getCount(){
        return count;
    }
}

class WorkerThread extends Thread {
    private SharedResources resource;
    public WorkerThread(SharedResources resource){
        this.resource = resource;
    }

    @Override
    public void run(){
        for (int i = 0; i<1000; i++){
            resource.increment();
        }
    }
}


public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedResources resources = new SharedResources();
        WorkerThread wthread1 = new WorkerThread(resources);
        WorkerThread wthread2 = new WorkerThread(resources);
        wthread1.start();
        wthread2.start();
        wthread1.join();
        wthread2.join();
        System.out.println("Done, "+resources.getCount());
    }
}