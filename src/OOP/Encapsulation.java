package OOP;

import Array.Array;

public class Encapsulation {
    private String name;
    private String[] arr = new String[3];
    public Encapsulation(String name_){
        name = name_;
    }

    public String getName(){
        return this.name;
    }
    public String[] getArr(){
        return this.arr;
    }
    public static void main(String[] args) {

    }
}
