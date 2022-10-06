package Practice;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        System.out.println("Nhap nam");
        Scanner input = new Scanner(System.in);
        short year = input.nextShort();
        if ((year%4 == 0)&&(year%100 != 0) || (year%400 == 0) ){
            System.out.println(" Day la nam nhuan ");
        }else {
            System.out.println( "Day khong phai la nam nhuan ");
        }
    }
}
