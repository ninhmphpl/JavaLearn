package Thread.Demo;

import java.util.Scanner;

public class Demo extends Thread {
    public String name;
    int number = 1000;

    public Demo(String name) {
        this.name = name;
    }


    public void run(){
        System.out.println("nhap luồng " + Thread.currentThread().getName());
        number = new Scanner(System.in).nextInt();
        System.out.println("Number luồng " + Thread.currentThread().getName() + ":" + number  );

    }


}
