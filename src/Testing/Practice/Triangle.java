package Testing.Practice;

public class Triangle {
    public boolean isoscelesTriangle(int a , int b, int c){
       return (a == b) && (a == c);
    }
    public boolean isEquilateralTriangle(int a, int b, int c){
        return (a == c) || (a == b) || (b == c);
    }
    public boolean isTriangle (int a , int b , int c){
        return ((a+b > c) && (b+c > a) && (a+c > b));
    }


    public int checkTriangle (int a, int b, int c){


        if (! isTriangle(a, b, c)){
            return 0;
        }else if (isoscelesTriangle(a,b,c)){
            return 3;
        }else if (isEquilateralTriangle(a,b,c)){
            return 2;
        }else {
            return 1;
        }

    }
}
