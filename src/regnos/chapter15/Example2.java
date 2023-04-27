package regnos.chapter15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example2 {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\Tinuade\\Desktop\\FilesJava");
        try(var directoryStream=Files.newDirectoryStream(path)){
            var iterator = directoryStream.iterator();
            while(iterator.hasNext()){
                Path path1=iterator.next();
                System.out.println(path1.getFileName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
