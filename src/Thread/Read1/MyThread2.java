package Thread.Read1;

public class MyThread2 extends Thread{
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100,"T2-");
    }
}
