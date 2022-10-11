package OOP.Practice;

public class Fan {
    private final int slow = 1;
    private final int hight = 2;
    private final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSlow() {
        return slow;
    }

    public int getHight() {
        return hight;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return (on)?"Speed: " + this.speed + ", Radius: " + this.radius + ", Color: " + this.color + ", Fan is On" : "Radius: " + this.radius + ", Color: " + this.color + ", Fan is Off";
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setOn(true);
        fan1.setSpeed(fan2.getHight());
        fan1.setColor("yellow");
        fan2.setRadius(10);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }
}
