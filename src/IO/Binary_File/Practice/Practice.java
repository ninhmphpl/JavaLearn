package IO.Binary_File.Practice;

import java.io.File;
import java.io.IOException;

public class Practice extends __File {
    public static void main(String[] args) throws IOException {
        File source = new File("IO/Practice/Source.txt");
        File dest = new File("IO/Practice/Dest.txt");
        copyFileUsingStream(source,dest);
        printBinaryFile(dest);




    }
}
