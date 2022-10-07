package Array.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang2 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,3,2,1,4,4};
        int[] arr2 = new int[arr.length];
        int index = 0;
        int cout = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so can xoa");
        int number = input.nextInt();
        for (int value : arr){
            if (value != number){
                arr2[index++] = value;
            }else{
                cout++;
            }
        }
        int[] arr3 = new int[arr.length - cout];
        for (int i = 0 ; i < arr3.length; i ++){
            arr3[i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
