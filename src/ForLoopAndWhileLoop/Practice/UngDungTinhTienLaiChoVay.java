package ForLoopAndWhileLoop.Practice;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lai suat");
        float tyLeLaiSuat = input.nextFloat();
        System.out.println("So tien gui");
        int soTienGui = input.nextInt();
        System.out.println("So thang gui");
        int soThangGui = input.nextInt();;
        float  soTienLai = soTienGui*(tyLeLaiSuat/100/12)*soThangGui;
        System.out.println("So Tien Lai : " + soTienLai);
    }
}
