package Array.Practice;

import java.util.Scanner;

public class DemSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = "asdfkasgaspdoiausdfopajslcfaseljapsdmga";
        int cout = 0;
        char unit = input.next().charAt(0);
        for (int i = 0 ; i < string.length(); i ++ ){
            if ( string.charAt(i) == unit ){
                cout ++;
            }
        }
        boolean a = ("faaf" == "faff");
        System.out.println(a);
        System.out.println(cout);

    }
}
