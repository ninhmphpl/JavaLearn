package Thread.Demo;


public class Main {

    public static void main(String[] args) {
        int[] a  = new int[]{1,3,5,1,34,123,3,51,34,12,3,1234,21,342134134};

        ChuongTrinh1 c3 = new ChuongTrinh1();

        ChuongTrinh2 c2 = new ChuongTrinh2();
        c3.start();
        c2.start();
    }
}
