package OOP.AccessModifier.Practice;

public class Student {
    private int rollono;
    private String name;
    private static String college = "BBDIT";
    public Student (int r, String name){
        this.name = name;
        this.rollono = r;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println( rollono + " " + name + " " + college);
    }
}
