package IO.Binary_File;

import OOP.Quit.Product;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class __ObjectInputStream {
    public static void main(String[] args) {
        ObjectInputStream objectInputStream;
        try{
            FileInputStream fileInputStream = new FileInputStream("object.txt");
            ArrayList<Product> data;
            System.out.println(fileInputStream.read());
            while (fileInputStream.available() > 0){
                objectInputStream = new ObjectInputStream(fileInputStream);
                data = (ArrayList<Product>) objectInputStream.readObject();
                System.out.println(data.toString());
            }
        } catch (IOException e ) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
