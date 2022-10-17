package OOP.Abstract;

public class Vd1 {
    private int a;
    private int b;

    public Vd1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int pullB() {
        return b;
    }

    @Override
    public String toString() {
        return "Vd1{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
