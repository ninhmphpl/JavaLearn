package Sort;

import java.util.Arrays;

public class SelectionSort extends Sort{
    static void sort(int [] arr){
        for (int i = 0 ; i < arr.length;i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i]>arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }
}
