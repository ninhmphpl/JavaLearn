package Thread.Wait_Notify;

import java.util.Random;

public class Thread1 extends Thread{
    @Override
    public void run() {
        Random random = new Random();
        int a = random.nextInt(20);
        System.out.println("a: " + a);
    }
}
