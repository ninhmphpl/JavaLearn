package OOP;

public class Opp {
    int x = 5;
//    this method just connect by it's Object create by Class
    public int sum (int x, int y){
        int sum = x + y;
        return sum;
    }
//    this method can connect in this class but other class cant connect it
    static  int avg (int total, int length){
        int avg = total/length;
        return avg;
    }
    public static void main(String[] args) {
        Opp oject1 = new Opp();
        System.out.println(oject1.x);
    }
}
