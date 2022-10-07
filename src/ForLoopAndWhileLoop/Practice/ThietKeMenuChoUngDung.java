package ForLoopAndWhileLoop.Practice;

import java.util.Scanner;

public class ThietKeMenuChoUngDung {
    static void rectangel(){
        for (int i = 0 ; i < 10 ; i ++){
            System.out.println("**************************");
        }
    }
    static void triangel(){
        for (int i = 0 ; i < 10 ; i ++){
            System.out.println("*".repeat(i));
        }
    }
    static void triagel2(){
        for (int i = 1 ; i <= 10 ; i ++){
            System.out.println(" ".repeat(10-i)+"* ".repeat(i));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            int number = input.nextInt();
            switch (number){
                case 1:
                    triangel();
                    break;
                case 2:
                    rectangel();
                    break;
                case 3:
                    triagel2();
                    break;
                default:
                    flag = false;
            }
        }
    }
}
