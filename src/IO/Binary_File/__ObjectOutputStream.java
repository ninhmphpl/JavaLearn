package IO.Binary_File;

import OOP.Quit.Product;

import java.io.*;
import java.util.ArrayList;

public class __ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream = null;
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("object.txt",true);

            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            ArrayList<Product> data = new ArrayList<>();
            data.add(new Product("test111", 1200, "china"));
            objectOutputStream.writeObject(data);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            assert objectOutputStream != null;
            objectOutputStream.close();
        }
    }
}
