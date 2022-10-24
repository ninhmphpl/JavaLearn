package IO.TextFile;

import java.io.*;

public class __BufferWriter {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try{
            if(file.createNewFile()){
                System.out.println("tao file thanh cong");
            }else {
                System.out.println("file da ton tai, tao file that bai");
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
