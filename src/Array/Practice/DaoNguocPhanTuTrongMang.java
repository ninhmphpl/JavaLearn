package Array.Practice;

import java.util.Arrays;

public class DaoNguocPhanTuTrongMang {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,7,7,8,5,5,4,3};

        int i = 0 ,j = arr.length - 1 ;
        while ( i < j ){
            int tempt = arr[i];
            arr[i] = arr [j];
            arr[j] = tempt;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
