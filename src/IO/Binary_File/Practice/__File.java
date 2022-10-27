package IO.Binary_File.Practice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;

public class __File {
    /**
     *
     * @param file file need to check
     * @Info check file to create new parent and new file if it is not found
     */
    public static void checkExitsFile(File file){
        try {
            if (!file.exists()) {
                Files.createDirectories(Path.of(file.getParent()));
                file.createNewFile();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param source file Copy
     * @param dest file Pate
     *             like copyFileUsingJava7Files, this is fake of it
     */

    public static void copyFileUsingStream(File source, File dest) {
        checkExitsFile(source);
        checkExitsFile(dest);
        try(FileInputStream fileInputStream = new FileInputStream(source);
            FileOutputStream fileOutputStream = new FileOutputStream((dest))){
           byte[] buffer = new byte[1024];
           int length;
           while ((length = fileInputStream.read(buffer))>0){ // đọc file và ghi vào mảng buffer(byte array)
               fileOutputStream.write(buffer,0,length); // write ghi vào mảng từ byte chuyển sang char
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param file file need to read, this method to show the string on screen
     */
    public static void printBinaryFile(File file){
        if (file.exists()){
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int a;
                byte[] data = new byte[10];

                while ( (a = fileInputStream.read(data)) > 0) {
                    System.out.println(Arrays.toString(data));
                    StringBuilder b = new StringBuilder();
                    for (int i = 0; i < a; i++) {
                        b.append((char) data[i]);
                    }
                    System.out.println(b);

                    System.out.println("read length " + a);

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *
     * @param source file copy
     * @param dest file pate
     * @throws IOException
     */
    public static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    /**
     *
     * @param file file need to write
     * @param object object need write to file
     * @param append choice append, true do append, false don't append
     * @throws IOException
     */
    public static void writeObjectToFile(File file, Object object, boolean append) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file,append);
        checkExitsFile(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);

    }

    public static ArrayList<Object> readObjectFormFile(File file) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ArrayList<Object> arr = new ArrayList<>();
        while (fileInputStream.available()>0){
             arr.add(new ObjectInputStream(fileInputStream).readObject());
        }
        return arr;
    }



}
