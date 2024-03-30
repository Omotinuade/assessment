package regnos.chapter17.stream;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        var result =words.stream().collect(Collectors.partitioningBy((w)->w.length()%2==0));
        System.out.println(result);
       var result1 =words.stream()
               .collect(Collectors.partitioningBy((w)->w.length()%2==0, Collectors.toSet()));
        flatMapCollection();
    }
    public static void flatMapCollection(){
        List<String> words = List.of(
                "Alpha",
                "Beta",
                "Omega",
                "Traffic"
        );
        System.out.println(words.stream().flatMap(w->List.of(w.split("")).stream()).collect(Collectors.joining("+")));
       var list= words.stream().flatMap(w-> Stream.of(w.split(""))).toList();
        System.out.println(list);
    }
}
