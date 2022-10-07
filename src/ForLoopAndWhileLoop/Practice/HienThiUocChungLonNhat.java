package ForLoopAndWhileLoop.Practice;

import java.util.Scanner;

public class HienThiUocChungLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so A: ");
        int aNumber = input.nextInt();
        System.out.print("Nhap so B: ");
        int bNumber = input.nextInt();
        int maxUoc = 1;
        for (int uoc = aNumber; uoc >= 1 ; uoc --){
            if ( (aNumber % uoc == 0) && (bNumber % uoc == 0) ){
                maxUoc = uoc;
                break;
            }
        }
        System.out.println("Uoc Chung Lon Nhat = " + maxUoc);

    }
}
