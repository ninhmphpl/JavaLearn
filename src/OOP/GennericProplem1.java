package OOP;

import java.util.ArrayList;
import java.util.List;

public class GennericProplem1 {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);

//        List<? extends Number> nums = ints;

        List<? extends Number> nums = new ArrayList<Integer>(); // now this line works
        /*
         *without using ? syntax above line did not use to compile earlier
         */
        List<Double> doubleList = new ArrayList<Double>();
        doubleList.add(1.0);
        doubleList.addAll(doubleList); // compile time error
    }
}
