package Thread.Practice;

public class RunnableDemo extends Thread {
    private Thread t;
    private final String threadName;

    public RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Dừng vòng lặp trong 50 ms
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName); //
            t.start(); // start cua đối tượng Thread sẽ gọi run() của đối tượng chứa trong nó
        }
    }

}
