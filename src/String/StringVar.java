package String;

import java.util.Arrays;

public class StringVar {
    public static void main(String[] args) {
//        JavaSring
        String noTxt = "hello";
//        String Length
        noTxt.length(); // 5
//        More String Methods
//        toUpperCase() and topLowerCase()
        String txt = "Hello World";

        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());


//      indexOf() Finding a Character in a String
        System.out.println(txt.indexOf("World")); // index = 6

//        split() Converting String type to Array type
        String arrTxt[] = txt.split(" ");
        System.out.println(arrTxt[0]);// Hello
        System.out.println(arrTxt[1]);// World


//        charAt() show a char at index of String
        System.out.println(txt.charAt(0));// H

//    https://www.w3schools.com/java/java_ref_string.asp


    }
}
