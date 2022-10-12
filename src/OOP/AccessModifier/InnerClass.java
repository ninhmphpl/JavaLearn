package OOP.AccessModifier;
public class InnerClass {
    class A{}
    public static class B{}
}

class Tes2 {
    public static void main(String[] args) {
        InnerClass.A a = new InnerClass().new A();

        InnerClass.B b = new InnerClass.B();
    }
}