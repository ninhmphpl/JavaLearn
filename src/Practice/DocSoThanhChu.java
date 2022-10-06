package Practice;

import java.util.Scanner;
public class DocSoThanhChu {
    static String unit (char number){
        String string;
                string = "";
        switch (number){
            case '1':
                string = "one";
                break;
            case '2':
                string = "two";
                break;
            case '3':
                string = "three";
                break;
            case '4':
                string = "four";
                break;
            case '5':
                string = "five";
                break;
            case '6':
                string = "six";
                break;
            case '7':
                string = "seven";
                break;
            case '8':
                string = "eight";
                break;
            case '9':
                string = "nine";
                break;
            default: string = "";
        }
        return string;
    }
    static String dozen(char dozens,char units){
        String string;
        switch (dozens){
            case '1':
                string = numberTeen(units);
                break;
            case '2':
                string = "Twenty-" + unit(units) ;
                break;
            case '3':
                string = "thirty-" + unit(units);
                break;
            case '5':
                string = "fifty-" + unit(units);
                break;
            case '0':
                string = unit(units);
                break;
            case 'f':
                string = "";
                break;
            default:
                string = unit(units)+"ty" + unit(units);
        }
        return string;
    }
    static String hundereds(char hundered, char dozens, char units){
        String string = "";
        string = unit(hundered) + " hundred " + dozen(dozens,units);
        return string;
    }
    static String numberTeen(char number){
        String string2;
        switch (number) {
            case '1':
                string2 = "eleven";
                break;
            case '2':
                string2 = "twelve";
                break;
            case '3':
                string2 = "thirteen";
                break;
            case '4':
                string2 = "fourteen";
                break;
            case '5':
                string2 = "fifteen";
                break;
            case '6':
                string2 = "sixteen";
                break;
            case '7':
                string2 = "seventeen";
                break;
            case '8':
                string2 = "eighteen";
                break;
            case '9':
                string2 = "nineteen";
                break;
            default:
                string2 = "";
        }
        return string2;
    }
    static char stringLength (String number, int index){
        char numberChar;
        if ((number.length() - index) < 0){
            return 'f';
        }else{
            return number.charAt(number.length()-index);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        String readNumber = "" ;
        readNumber += hundereds(stringLength(string,3),stringLength(string,2),stringLength(string,1));
        System.out.println(readNumber);


    }
}
