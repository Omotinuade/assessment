package regnos.chapter17.stream;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<String> words = List.of(
                "Alpha",
                "Beta",
                "Omega",
                "Traffic"
        );

       // words.stream().collect(Collectors.toCollection(TreeSet::new)); returns a collection
        System.out.println(words.stream().collect(Collectors.joining("+")));
    }
}
