package Sort;

import java.util.Arrays;

public class Sort {
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int[] arrayRandom(int length) {
        int [] a = new int[length];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int )Math.floor(Math.random()*length);
        }
        return a;
    }
}
