package Array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        System.out.println(" mang 1 chieu trong Java ");
        // cú pháp tạo mảng
        // typeVar [] nameArray;
        // typeVar [] nameArray = {value,value};
        // ví dụ
        int[] number = {3 , 45 , 3 };
        String[] friends = {"ninh", "yen" , "van"};
        float[] marks = {5.4f , 3.4f, 7.4f , 9,14f};
        // lấy độ dài của mảng
        System.out.println( number.length);
        // lấy giá trị của 1 phần tử
        System.out.println(friends[1]);
        // in ra 1 mảng thông qua Arrays.toString()
        System.out.println(Arrays.toString(friends));
        // gán giá trị cho 1 phần tử
        marks[0] = 3.4f;
        System.out.println(Arrays.toString(marks));


        System.out.println("===========================");


        //  cú pháp cấp phát mảng
        int[] arr1 = new int[100];
        arr1[0] = 1;
//        System.out.println(Arrays.toString(arr1));
        boolean[] arr2 = new boolean[100];
        String[] arr3 = new String[100];
        System.out.println(arr1[0] + "," + arr2[0] + "," + arr3[0]);
        // tạo la độ dài cho mảng
        arr1 = new int[101];
//        System.out.println(Arrays.toString(arr1));

    }
}
