package IO.TextFile.Practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumNumberInFile {
    private static int total;
    static void sum(int number){
        total += number;
    }
    public static void main(String[] args) {
        File file = new File("IO/Practice/SumNumBerInFile.txt");
        try{
            if(!file.exists()){ // kiểm tra file nếu không tồn tại thì tạo file
            Files.createDirectories(Path.of(file.getParent()));// tạo folder đường dẫn
            file.createNewFile();// tạo file
            }

            FileReader fileReader = new FileReader(file); // tạo đối tượng ghi file
            int a;
            while ((a = fileReader.read()) != -1){
                sum(a - '0');
                fileReader.skip(2); // loại bỏ kí tự \n và \r (đọc 1 ký tự và bỏ qua n kí tự tham số)
            }
            System.out.println(total);

        }catch (IOException e ){
            System.out.println(e.getMessage());
        }
    }
}
