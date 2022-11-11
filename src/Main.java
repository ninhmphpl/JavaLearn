import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Hello " + name + ", Welcome!");
        main(null);
    }
}
