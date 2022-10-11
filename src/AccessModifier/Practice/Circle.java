package AccessModifier.Practice;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle (){}
    public Circle(double radius){
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }
    public double getErea(){
        return (radius*Math.PI*radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4.0);
        System.out.println(circle.getErea());
    }
}
