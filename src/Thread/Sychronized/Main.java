package Thread.Sychronized;

public class Main {
    public static void main(String[] args) {
        Synchronized_Dm1 dm1 = new Synchronized_Dm1();

        Thread t1 = new Thread(dm1,"t1");
        Thread t2 = new Thread(dm1, "t2");
        t1.start();
        t2.start();
    }
}
