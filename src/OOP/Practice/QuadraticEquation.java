package OOP.Practice;

import java.util.Scanner;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;
    public QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getDiscriminant(){
        return (this.b*this.b - 4*this.a*this.c);
    }
    public double getRoot1(){
        return ((-this.b + Math.sqrt(getDiscriminant()))/2*this.a);
    }
    public double getRoot2(){
        return ((-this.b - Math.sqrt(getDiscriminant()))/2*this.a);
    }

    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("nhap gia tri a: ");
        int a = input.nextInt();
        System.out.print("nhap gia tri b: ");
        int b = input.nextInt();
        System.out.print("nhap gia tri c: ");
        int c = input.nextInt();
        QuadraticEquation math = new QuadraticEquation(a,b,c);
        if (math.getDiscriminant()<0){
            System.out.println(" Phuong Trinh vo nghiem");
        }else if (math.getDiscriminant() == 0){
            System.out.println("Phuong trinh co 1 nghiem : " + math.getRoot1());
        }else{
            System.out.println("Phuong trinh co 2 nghiem, X1: " + math.getRoot1() + " X2: " + math.getRoot2());
        }


    }
}
