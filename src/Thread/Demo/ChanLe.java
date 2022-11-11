package Thread.Demo;

import java.util.Scanner;

public class ChanLe extends Thread {
    public void chan() throws InterruptedException{
        while (true){
            Thread.sleep(1000);
            System.out.println(1);
        }

    }

    public void le() throws InterruptedException {
        while (true){
            Thread.sleep(1000);
            System.out.println(2);
        }

    }

    @Override
    public synchronized void run () {
        int[] a  = new int[]{1,3,5,1,34,123,3,51,34,12,3,1234,21,342134134};
        System.out.println("lua chon in ra chan luong : " + Thread.currentThread().getName());
        int choice = new Scanner(System.in).nextInt();
        switch (choice){
            case 1:
                try {
                    chan();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 2:
                try {
                    le();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                System.exit(0);
        }

    }
}
