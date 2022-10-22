package Seach;

import Sort.QuickSort;

import java.util.Scanner;

public class SortChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int[] arr = new int[string.length()];
        for (int i = 0 ; i < string.length(); i ++){
            arr[i] = string.charAt(i);
        }
        QuickSort.sort(arr);
        StringBuilder newString = new StringBuilder();
        for (int s : arr){
            newString.append((char) s);
        }
        System.out.println(newString);

    }
}
