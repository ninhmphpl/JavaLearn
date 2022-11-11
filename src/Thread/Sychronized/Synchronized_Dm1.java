package Thread.Sychronized;

public class Synchronized_Dm1 implements Runnable{
    @Override
    public synchronized void run() { // chỉ cho phép 1 luồng sử dụng trong 1 thời điểm
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ ":" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
