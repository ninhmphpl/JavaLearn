package OOP.Abstract.Practice;

import OOP.Abstract.Practice.Comparable.Circle;
import OOP.Abstract.Practice.DemoArrayList.DemoArrayList;

import java.util.ArrayList;

public class MainComparable {
    public static void main(String[] args) {
        Circle circle = new Circle(10,10,33);
        Circle circle2 = new Circle(10,10,33);
        circle.compareTo(circle2);
        DemoArrayList<Circle> array = new DemoArrayList<Circle>();



    }
}
