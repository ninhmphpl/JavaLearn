package IO.Binary_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class __test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("object");
        ArrayList<Object> objectsList = new ArrayList<>();
        boolean cont = true;
        while (cont) {
            try (ObjectInputStream input = new ObjectInputStream(fis)) {
                Object obj = input.readObject();
                if (obj != null) {
                    objectsList.add(obj);
                } else {
                    cont = false;
                }
            } catch (Exception e) {
                e.printStackTrace();
                // System.out.println(e.printStackTrace());
            }finally {
                fis.close();
            }
        }
    }
}
