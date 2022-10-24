package ExceptionAndDebug.Exception.Practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static Integer[] createRandom () {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("danh sach phan tu cua mang");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr = createRandom();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int x = input.nextInt();
        try{
            System.out.println("Gia tri co chi so : " + x + " la : " + arr[x]);
        }catch (Exception e){
            System.out.println("Chi so vuot qua gioi han cua mang");
        }

    }
}
