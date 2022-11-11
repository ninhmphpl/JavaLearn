package StringBuilderAndRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class __Regex {
    public static void main(String[] args) {
        String text = "abc\\ab*c";
        Matcher matcher = Pattern.compile("a+").matcher(text);
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(),matcher.end()));
        }
//        System.out.println(matcher.matches());




    }
}
