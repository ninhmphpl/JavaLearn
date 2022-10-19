package OOP.Map.MapTree.Practive;

import java.util.HashMap;
import java.util.Map;

public class LuuDanhSachSinhVienTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("A", 12);
        students.put("B", 32);
        students.put("E", 10);
        students.put("R", 40);
        students.put("O", 12);
        students.put("M", 32);
        students.put("Z", 33);
        // map sẽ không cho các key có thể trùng tên nhau, nếu trùng
        // thì giá trị sẽ bị đè va giá trị trước đó
        // Thứ tự sắp xếp từ lớn đến nhỏ, nếu là ký tự thì xếp theo abc => xyz
        System.out.println(students);
    }

}
