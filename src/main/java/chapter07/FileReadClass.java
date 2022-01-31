package chapter07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadClass {
    private static String filePath = "D://";
    private static String fileName = "file.txt";
    public static void main(String[] args) throws IOException {
        printFileList();
        System.out.println("-----------");
        printUseForFileReader();

    }
    public static void printFileList(){
        File file = new File(filePath);
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }

    public static void printUseForFileReader() throws IOException {
        FileReader fileReader = new FileReader(filePath + fileName);
        int ch;
        while ((ch = fileReader.read()) != -1){
            System.out.print((char) ch);
        }
    }
}
