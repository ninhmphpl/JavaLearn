package OOP.Abstract;

public class Main {
    public static void main(String[] args) {
        Example1 ex1 = new Example2();
        ex1.example1(); // ex1 Khong co example2() vi Example1 khong co phuong thuc example2();
        Example2 ex2 = (Example2) ex1;
        ((Example2)ex1).example2(); // Cach ep kieu 2 <=> line 7

        boolean check =  ex1 instanceof Example2 ;
        System.out.println(check);
        ex2.example1();
        ex2.example2(); // ex2 co phuong thuc example2()

        System.out.println("--------------------------------");
        Example1 ex3 = new Example2();
        ex3.example1_2();

    }
}
