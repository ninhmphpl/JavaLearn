package OOP.Map.HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Example_1 {
    public static void main(String[] args) {
        HashMap<String, Integer> customers = new HashMap<>();
        customers.put("John", 30);
        customers.put("Mike", 28);
        customers.put("Bill", 32);
        customers.put("Maria", 27);
        String a = "[1,3,5,1,2,]";

        Set<String> keys = customers.keySet();
        System.out.println(keys);
        for (String key: keys){
            System.out.println("Key: " + key + ": " + customers.get(key));
        }
    }
}
