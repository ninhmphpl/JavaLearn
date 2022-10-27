package IO.Binary_File.Practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DocVaGhiDanhSachHocSinhRaFileNhiPhan extends __File{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("IO/student.txt");

        for (int i = 0 ; i < 1000 ; i ++){
            writeObjectToFile(file,new Student("Studen" + i, 20, "Ha Noi-" + (i*2)), true);
        }
        ArrayList<Object> arr = readObjectFormFile(file);
        System.out.println(arr);

    }
}
