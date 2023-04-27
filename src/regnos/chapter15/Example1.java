package regnos.chapter15;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {
    public static void main(String[] args) {
        Path path = Paths.get("a:/b/c.java");

        System.out.println("Filename::" +path.getFileName());
        System.out.println("FileSystem::" +path.getFileSystem());
        System.out.println("Root::" +path.getRoot());
        System.out.println("isAbsolute?::" +path.isAbsolute());
        System.out.println(System.getProperty("file.separator"));

        Path path1 = Path.of(  "c.java");
        System.out.println(path1);
        System.out.println(path.endsWith(path1));
    }
}
