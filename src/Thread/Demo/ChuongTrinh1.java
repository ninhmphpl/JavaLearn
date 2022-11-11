package Thread.Demo;

import Sort.QuickSort;

import java.util.Arrays;

public class ChuongTrinh1 extends Thread{
    int[] a  = new int[]{1,3,5,1,34,123,3,51,34,12,3,1234,21,342134134};

    @Override
    public void run() {
        QuickSort.sort(a);
        System.out.println(Thread.currentThread().getName() + Arrays.toString(a));
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println("ina");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
