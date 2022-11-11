package Thread.Demo;

public class ChuongTrinh2 extends Thread{
    int[] a  = new int[]{1,3,5,1,34,123,3,51,34,12,3,1234,21,342134134};

    @Override
    public void run() {
        int max = 0;
        for (int i : a){
            if (max<i) max = i;
        }
        System.out.println(Thread.currentThread().getName() + max);
        while(true){
            try {
                Thread.sleep(1500);
                System.out.println("inb");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
