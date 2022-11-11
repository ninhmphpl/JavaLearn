package Thread.Implement_Runable;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Demo_1 demo_1 = new Demo_1(); // đối tượng phải được implement Runable
        Demo_2 demo_2 = new Demo_2(); // để có thể khởi chạy thông qua lớp Thread

        // isAlive() : kiểm tra hàm còn sống hay không

        Thread t1 = new Thread(demo_1);
        Thread t2 = new Thread(demo_2);

        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
        t1.join(); // chờ luồng chết thì tiếp tục chạy dòng lệnh tiếp theo
        t2.join();
    }
}
