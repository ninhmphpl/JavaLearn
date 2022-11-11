package StringBuilderAndRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class __StringBuilder {
    public static void main(String[] args) {


        String text1 = "Hello java regex 2-12-2018, hello world 12|12|2018";

        Pattern pattern = Pattern.compile("\\w{1,2}[-|/]\\w{1,2}[-|/]\\w{4}");

        Matcher matcher = pattern.matcher(text1);
        StringBuilder stringBuilder = new StringBuilder();


        Matcher matcher1;
        matcher1 = Pattern.compile("hello|world|java").matcher(text1);

        while (matcher1.find()) {

            System.out.println(text1.substring(matcher1.start(), matcher1.end()));// lấy string từ vị trí start() đến vị trí end()

        }

        System.out.println("Ngày tháng trong chuỗi text1: " + text1);

        //matcher.find tìm thấy chuỗi hợp lệ, trả về true và ngược lại trả về false,
        // method start() và end() sẽ là vị trí của chuỗi được tìm thấy
        while (matcher.find()) {

            System.out.println(text1.substring(matcher.start(), matcher.end()));

        }
    }
}
