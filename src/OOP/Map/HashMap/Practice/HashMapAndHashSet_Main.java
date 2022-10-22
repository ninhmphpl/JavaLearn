package OOP.Map.HashMap.Practice;

import java.util.*;

public class HashMapAndHashSet_Main {
    public static void main(String[] args) {
        HashMapAndHashSet student1 = new HashMapAndHashSet("Nam",20, "HN");
        HashMapAndHashSet student2 = new HashMapAndHashSet("Hung",21, "HN");
        HashMapAndHashSet student3 = new HashMapAndHashSet("Ha",22, "HN");
        Map<Integer, HashMapAndHashSet> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for(Map.Entry<Integer, HashMapAndHashSet> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }
        // HashMap chứa key và value(đối tượng Object)
        // HashMap Không cho phép cho 2 key giống nhau nhưng cho phép 2 value giống nhau

        System.out.println("...........Set");
        Set<HashMapAndHashSet> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1); // value này sẽ đè vào value đầu tiên
        // HashSet chỉ chứa đối tượng (value) không chứa key
        // HashSet không cho phép 2đối tượng trùng tên nhau

        for(HashMapAndHashSet student : students){
            System.out.println(student.toString());
        }
    }
}
