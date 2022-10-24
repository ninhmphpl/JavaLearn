package IO.TextFile;

import java.io.File;

public class __File {
    public static void main(String[] args) {
        File file = new File("file.txt");
        File folder = new File("NewFolder");
        folder.mkdir();
        if (folder.isDirectory()) {
            String[] dirContents = folder.list();
            for (int i = 0; i < dirContents.length; i++) {
                System.out.println(dirContents[i]);
            }
        }
        System.out.println(folder.getAbsolutePath());

    }
}
