package regnos.chapter15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesExample2 {
    /*This method helps to create files from an array of Strings passed into the program as an array*/
    public static void main(String[] args) {
        for (String arg : args) {
            Path path = Path.of("C:\\Users\\Tinuade\\Desktop\\FilesJava" + "\\" + arg + ".java");
            try {
                var filepath = Files.createFile(path);
            } catch (IOException e) {
                System.out.println((e.getMessage()));
            }
        }
    }
}
