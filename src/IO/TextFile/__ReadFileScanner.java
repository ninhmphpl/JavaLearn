package IO.TextFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class __ReadFileScanner {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            myObj.createNewFile();
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("ahiahia");
        }
    }
}
