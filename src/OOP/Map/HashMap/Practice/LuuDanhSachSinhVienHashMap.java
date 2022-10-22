package OOP.Map.HashMap.Practice;

import java.util.HashMap;
import java.util.Map;

public class LuuDanhSachSinhVienHashMap {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("A", 12);
        students.put("B", 32);
        students.put("E", 10);
        students.put("R", 40);
        students.put("O", 12);
        students.put("M", 32);
        students.put("Z", 33);
        // map sẽ không cho các key có thể trùng tên nhau, nếu trùng nhau
        // thì giá trị mới nhất sẽ bị đè va giá trị cũ trong key đó
        // Thứ tự sắp xếp ngẫu nhiên
        System.out.println("Student: " + students);
        System.out.println("Student HashCode: " + students.hashCode());
        System.out.println("key Z in Student HashMap : " + students.get("Z").hashCode());
        System.out.println("key A in Student HashMap : " + students.get("A").hashCode());
        System.out.println("key B in Student HashMap : " + students.get("B").hashCode());
        System.out.println("key E in Student HashMap : " + students.get("E").hashCode());

        Map<Integer,Integer> students2 = new HashMap<>();
        students2.put(2, 32);
        students2.put(4, 40);
        students2.put(3, 10);
        students2.put(1, 12);
        students2.put(7, 33);
        students2.put(5, 12);
        students2.put(6, 32);


        System.out.println("\nLấy giá trị từ key: " + students2.get(1));
        System.out.println("\nLấy giá trị từ key không có sẵn: " + students2.get(8));

        // replace(): thay đổi giá trị trong key của HashMap , giá trị trả về của Method là value cũ tại key
        System.out.println("\nThay đổi giá trị : " + students2.replace(1,34) +
                " thành : " +
                students2.get(1));

        //size(): lấy số lượng phần tử;
        System.out.println("\nLấy size (số lượng phần tử)" + students2.size());


        //hashCode(): lấy vị trí ô nhớ của đối tượng HashMap
        System.out.println("\nLấy vị trí ô nhớ của đối tượng HashMap: " + students2.hashCode());

        System.out.println("key 1 in Student HashMap : " + students2.get(1).hashCode());
        System.out.println("key 2 in Student HashMap : " + students2.get(2).hashCode());
        System.out.println("key 3 in Student HashMap : " + students2.get(3).hashCode());
        System.out.println("key 4 in Student HashMap : " + students2.get(4).hashCode());
        System.out.println("key 5 in Student HashMap : " + students2.get(5).hashCode());

        System.out.println("\n\nStudent2 : " + students2);
        System.out.println("Xóa key 3 khỏi HashMap: " + students2.remove(3));
        System.out.println("Student2 : " + students2);

        System.out.println("\n\nStudent2 : " + students2);
        System.out.println("Xóa key 3 khỏi HashMap: " + students2.remove(2,5));
        System.out.println("Student2 : " + students2);


    }
}
