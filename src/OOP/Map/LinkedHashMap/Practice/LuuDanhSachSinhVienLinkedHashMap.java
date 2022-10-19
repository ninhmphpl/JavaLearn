package OOP.Map.LinkedHashMap.Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class LuuDanhSachSinhVienLinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println(linkedHashMap);
        // xếp theo thứ tự thêm vào
    }
}
