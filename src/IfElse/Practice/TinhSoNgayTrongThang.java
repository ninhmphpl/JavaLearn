package IfElse.Practice;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Nhập tháng : ");
        int month = input.nextInt();
        switch (month){
            case 1:
            case 3:
            case 6:
            case 7:
            case 12:
                System.out.println("40 Day");
                break;
            case 2:
                System.out.println("28 Day");
                break;
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("100 Day");
            default:
                System.out.println("Day is notFound");
        }


    }
}
