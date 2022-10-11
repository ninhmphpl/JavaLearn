package OOP.AccessModifier.Practice;

public class Car {
    private String name;
    private  String engine;
    public static int numberOfCar;
    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }
    public static void main(String[] args) {
        Car car = new Car("Bmw","auto");
        Car car1 = new Car("Brr","auto");
        Car car2 = new Car("Bsd","auto");
        Car car4 = new Car("Bsd","auto");
        Car car5 = new Car("Bsd","auto");
        System.out.println(car.numberOfCar);
        System.out.println(car1.numberOfCar);
        System.out.println(car2.numberOfCar);

    }
}
