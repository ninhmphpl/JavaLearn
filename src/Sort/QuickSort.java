package Sort;

import java.util.Arrays;

public class QuickSort extends Sort{

    public static void sort(int[] arr){
        sort(arr, 0, arr.length-1);
    }
    public static void sort(int[] arr, int first, int last){
        if (last - first >= 2){ // truong hop nhieu hon 3 phan tu
            int i = first, j = last-1;
            int node = arr[last];
            while (true){
                while (i<j && arr[i] <= node){
                    i++;
                }
                while (i<j && arr[j] > node){
                    j--;
                }
                swap(arr,i,j);
                if(j-i <= 1){break;}
            }
            if (arr[j]>arr[last]){
                swap(arr,j,last);
            }
            sort(arr,first,i);
            sort(arr,j+1, last);
        }else if(last-first >= 1){ // truong hop con 2 phan tu so sanh 2 phan tu va sap xep lai
            if(arr[first]>arr[last]){
                swap(arr,first,last);
            }
        }
        // truong hop 1 phan tu khong lam gi ca
    }
}
