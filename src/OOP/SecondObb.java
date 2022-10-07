package OOP;

import Array.Array;

import java.util.Arrays;

public class SecondObb {
    public static void main(String[] args) {
        Encapsulation a = new Encapsulation("ninh");
        System.out.println(a);
        String b = a.getName();


        System.out.println(a.getName());
        b += "ono";
        System.out.println(b);
        System.out.println(a.getName());


        System.out.println("=========================");
        System.out.println(Arrays.toString(a.getArr()));
        String[] c = a.getArr();
        c[1] = "123";
        System.out.println(Arrays.toString(a.getArr()));
    }
}
