package OOP.AccessModifier;
public class Test{
    class A{}
    public static class B{}
}

class Tes2 {
    public static void main(String[] args) {
        Test a = new Test();
        Test.A a2 = a.new A();

        Test.B b = new Test.B();
    }
}