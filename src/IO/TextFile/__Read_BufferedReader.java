package IO.TextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class __Read_BufferedReader {
    public static void main(String[] args) {
        try {
            File file = new File("read.txt");
            file.createNewFile();
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
            System.out.println(bufferedReader.readLine());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
