package regnos.chapter17.stream;

import regnos.chapter17.functionalInterface.consumerSample.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamSampleOne {
    public static List<Integer> mapMethod (List<Integer> numbers){

        return numbers.stream().map(num->num*2).toList();
    }

    public static void main(String[] args) {
        var names= List.of("prof","zainab","tinu", "kabir", "michael", "joshua");
//        System.out.println(IntStream.rangeClosed(0, 20).filter(x -> x % 2 == 0).boxed().toList());
//        Random random = new Random();
//        System.out.println(IntStream.generate(()->1+random.nextInt(20)).limit(12).boxed().toList());
//        System.out.println(IntStream.iterate(0,i->i<20, x->x+2).boxed().toList().stream().toList());
//        System.out.println(names.stream().map(String::toUpperCase).filter(x->x.length()<=4).toList());
        System.out.println(names.stream().collect(Collectors.toMap(x -> x, String::length)));

        Map<String, Integer> map =new LinkedHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("AB", 2);

        System.out.println(map);
       var result= (map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (i, j)->i, LinkedHashMap::new)));
        System.out.println(map);
        System.out.println(result);

    }
}
