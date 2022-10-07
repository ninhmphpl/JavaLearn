package ForLoopAndWhileLoop.Practice;

public class KiemTraSoNguyenTo {
    public static boolean kiemTraSoNguyenTo(int number){
        boolean flag = true;
        if (number < 2 ){
            flag = false;
        }
        for ( int i = 2 ; i < number ; i++){
            if ( number % i == 0 ){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        for (int i = 0 ; i < 10 ; i ++){
            if (kiemTraSoNguyenTo(i)){
                System.out.println("so nguyen to : " + i);
            }
        }
    }
}
