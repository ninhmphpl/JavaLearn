package Array.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
    static int[] deleteUnitArray(int[] arr, int index){
        if ( index == arr.length - 1){
            arr[index] = 0;
        }else{
            for (int i = index ; i + 1 < arr.length; i ++){
                arr[i] =  arr[i+1];
                arr[arr.length - 1] =  0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9};
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so can xoa");
        int number = input.nextInt();
        int index = 0;
        boolean flag = false;

        for (int i = 0; i < arr.length ; i ++) {
            if (arr[i] == number){
                flag = true;
                index = i--;
                deleteUnitArray(arr, index);
            }
        }
        if (!flag){
            System.out.println("Khong co so nay trong mang, nhap vi tri muon xoa (< " + arr.length + ")");
            index = input.nextInt();
            deleteUnitArray(arr, index);
        }
        System.out.println(Arrays.toString(arr));
    }
}