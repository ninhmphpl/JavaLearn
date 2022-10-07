package ForLoopAndWhileLoop.Practice;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        KiemTraSoNguyenTo check = new KiemTraSoNguyenTo();
        int cout = 0;
        int number = 0;
        while (cout <= 20){
            if (check.kiemTraSoNguyenTo(number)){
                System.out.println(number);
                cout++;
            }
            number++;
        }

    }
}
