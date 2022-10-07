package ForLoopAndWhileLoop.Practice;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        KiemTraSoNguyenTo check = new KiemTraSoNguyenTo();
        for (int i = 0; i <= 100 ; i ++){
            if (check.kiemTraSoNguyenTo(i)){
                System.out.println(i);
            }
        }
    }
}
