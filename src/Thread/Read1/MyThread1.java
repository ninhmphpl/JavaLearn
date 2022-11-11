package Thread.Read1;

public class MyThread1 extends Thread {
    Table t;
    Thread thread;

    MyThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5, "T1-");
    }
}
