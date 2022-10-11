package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Theory {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(12);
        number.add(23);
        number.add(1);
        number.add(3);

        Collections.sort(number);
//        number.removeAll(numbers1);


        System.out.println(number);
    }
}
