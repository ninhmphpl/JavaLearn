package IO.TextFile;

import java.io.*;

public class __PrintWriter {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            String string = "pham hai ninh";
            printWriter.print(string);
            printWriter.close();
            printWriter.append("dep trai");
            printWriter.close();
        }catch (IOException e ){
            e.printStackTrace();
        }

    }
}
