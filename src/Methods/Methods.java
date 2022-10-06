package Methods;

public class Methods {
    static void printHello(){
        System.out.println("Hello");
    }
    static int sum (int number_1, int number_2){
        int sum = number_1 + number_2;
        return sum;
    }

    public static void main(String[] args) {
        printHello();
        System.out.println(sum(1,3));
    }

}
