package IO.TextFile.Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MaxNumberInFile {
    public static void main(String[] args) throws IOException {
        File file = new File("IO/Practice/SumNumBerInFile.txt");
        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)){

            if(!file.exists()){ // kiểm tra file nếu không tồn tại thì tạo file
                Files.createDirectories(Path.of(file.getParent()));// tạo folder đường dẫn
                file.createNewFile();// tạo file
            }

            int max = 0;
            String string;
            while ((string = bufferedReader.readLine()) != null){
                if (max < Integer.parseInt(string)){
                    max = Integer.parseInt(string);
                }
            }

            System.out.println(max);

        }
    }
}
