package IO.Binary_File;

import java.io.*;

public class __InputStream {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("API.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            while (true) {
                System.out.println(dataInputStream.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
