package Array.Practice;

import java.util.Arrays;

public class ThemPhanTuTrongMang {
    static int[] addArray(int[] arr, int index, int number){
        for ( int i = arr.length - 1; i > index ; i --){
            arr[i] = arr[i-1];
        }
        arr[index] = number;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,9,0,0};
        addArray(arr, 3, 500);
        System.out.println(Arrays.toString(arr));

    }
}
