package IO.Binary_File.Practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class QuanLySanPhamLuuRaFileNhiPhan extends __File {
    static int random(int range){
        return (int) Math.floor(Math.random()*range);
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    File file = new File("IO/Product");
        for (int i = 0 ; i < 100 ; i++){
            Product1 product1 = new Product1("Xyz"+random(3), "Product" + random(1000), "HaVan", random(1000000), "No Description");
            writeObjectToFile(file, product1, true);
        }
        ArrayList<Object> arr = readObjectFormFile(file);
        System.out.println(arr);
    }
}
