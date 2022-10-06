package Practice;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap A:");
        float aValue = input.nextInt();

        System.out.println("Nhap B:");
        float bValue = input.nextInt();

        System.out.println("Nhap C:");
        float cValue = input.nextInt();
        System.out.println(aValue + "," + bValue + "," + cValue);

        if (aValue != 0){
            float deta = bValue*bValue - 4*aValue*cValue;
            float resuil1 = (float) -(bValue+Math.sqrt(deta))/(2*aValue);
            float resuil2 = (float) -(bValue-Math.sqrt(deta))/(2*aValue);
            System.out.println(resuil1);
            System.out.println(resuil2);

        }else{
            System.out.println("Phương trình vô nghiệm");
        }


    }
}
