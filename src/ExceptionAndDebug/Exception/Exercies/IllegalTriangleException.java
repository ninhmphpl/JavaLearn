package ExceptionAndDebug.Exception.Exercies;

import java.util.Scanner;

public class IllegalTriangleException {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            System.out.println("nhap a");
            int a = Integer.parseInt(input.nextLine());
            System.out.println("nhap b");
            int b = Integer.parseInt(input.nextLine());
            System.out.println("nhap c");
            int c = Integer.parseInt(input.nextLine());
            if ((a<0 || b<0 || c<0 || a+b <= c || a+c <= b || b+c <= a)) throw new RuntimeException("Erro");

        }catch (RuntimeException e){
            System.out.println(e.getMessage()+ " gia tri nhap vao khong hop le");
            main(null);
        }

    }
}
