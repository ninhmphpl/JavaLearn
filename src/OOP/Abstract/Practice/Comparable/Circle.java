package OOP.Abstract.Practice.Comparable;

public class Circle implements Comparable<Circle>{
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void compareTo(Circle circle) {
        if (this.getRadius() < circle.getRadius()){
            System.out.println("nho hon");
        }else{
            System.out.println("lon hon");
        }
    }
}
