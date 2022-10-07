package Array.Practice;

import java.util.Arrays;

public class GopMang {
    static int[] concat (int[] arr1 , int[] arr2){
        int[] newArray = new int[arr1.length + arr2.length];
        for (int i = 0 ; i < arr1.length ; i ++){
            newArray[i] = arr1[i];
        }
        int idex = arr1.length;
        for (int i = 0 ; i < arr2.length ; i ++){
            newArray[idex++] = arr2[i];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,6,6,7,3};
        int[] arr2 = {4,5,6,7,2,23,4,5};
        int[] arr3 = concat(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

    }
}
