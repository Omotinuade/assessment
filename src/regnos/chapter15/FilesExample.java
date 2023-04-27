package regnos.chapter15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesExample {
    public static void main(String[] args){
        Path path = Path.of("C:\\Users\\Tinuade\\Desktop\\FilesJava\\test.java");
        try{
            var filePath=  Files.createFile(path);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
