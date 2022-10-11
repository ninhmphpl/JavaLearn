package IfElse.Practice;

import java.util.Scanner;

public class TinhChiSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chieu cao");
        float height = input.nextFloat();
        System.out.println("Nhap can nang");
        float weight = input.nextFloat();
        float bmi = weight/(height*height);
        System.out.println("BMI: " + bmi);
        if ((bmi <= 25) && (bmi >= 18.5)){
            System.out.println("Nomal");
        }else if(bmi <= 18.5){
            System.out.println("UnderWeight");
        }else{
            System.out.println("OverWeight");
        }

    }
}
