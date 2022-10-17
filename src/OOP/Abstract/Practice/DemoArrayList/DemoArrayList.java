package OOP.Abstract.Practice.DemoArrayList;

import java.lang.reflect.Array;

import java.util.ArrayList;

public class DemoArrayList<T> {
    private final int size = 10;
    private Class<T> aClazz;

    private T[] myArray;

    public DemoArrayList() {

    }

    public T[] getMyArray() {
        return this.myArray;
    }

    public static void main(String[] args) {
        DemoArrayList<String> a = new DemoArrayList<String>();
    }
}
