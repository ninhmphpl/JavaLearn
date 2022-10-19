package OOP.StackAndQueue;

public class Test {
    public String out (){
        return "hello";
    }
    String th (){
        return out();
    }

    @Override
    public String toString() {
        return "Test{}";
    }

    public static void main(String[] args) {
        Test a = new Test();
        System.out.println(a);
    }
}
