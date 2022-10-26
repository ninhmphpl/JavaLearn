package IO.Binary_File;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class __OutputStream {
    public static void main(String[] args) {
        int[] a = {1,3,5,3,1,2,3,4,5};
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("API.txt",true);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            for (int b : a){
                dataOutputStream.writeInt(b);
            }
            dataOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
