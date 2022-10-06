package Operator.Practice;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
//        biến để sử dụng nhập liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        float width;
        float height;
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = width * height ;
        System.out.println("Area is: " + area);
    }
}
