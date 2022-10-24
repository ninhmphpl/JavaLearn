package IO.TextFile;

import java.io.*;

public class __Write {

    public static void main(String[] args) {
            File inFile = new File("Olo.text");
        try{
            System.out.println(inFile.createNewFile());
            FileWriter fileWriter = new FileWriter(inFile);
            fileWriter.write("Hello World");
            fileWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
