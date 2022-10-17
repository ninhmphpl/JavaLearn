package OOP.Abstract;

public class Vd2 extends Vd1 {
    public int c;
    public int d;

    public Vd2(int a, int b, int c, int d) {
        super(a, b); // thuộc tính private vẫn được thừa kế, nhưng không được thể hiện mà phải thông qua trung gian;
        this.c = c;
        this.d = d;
    }





    @Override
    public String toString() {
        return "Vd2{" +
                "c=" + c +
                ", d=" + d +
                '}';
    }
}
