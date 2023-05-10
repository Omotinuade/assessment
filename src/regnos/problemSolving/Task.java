package regnos.problemSolving;

import java.util.*;
import java.util.stream.Stream;

public class Task {
    public static void main(String[] args) {
        String[] arr = {"Ab1396", "Q2RBs", "G381ac","Ab1396","12qWtr"};
        int[] arr2 ={1,2,3,1,4,5,7};
        System.out.println(task(arr));
        task2(arr, arr2);
    }
    static int task(String[] arr){
        int count =0;
        for( var i : arr){
            for (int j = 0; j < i.length(); j++) {
                if(Character.isDigit(i.charAt(j))){
                    count++;
            }
            }
        }
        return count;
    }
    static void task2(String[] arr, int[] arr2) {
//        System.out.println(Arrays.stream(arr).
//                map(String::chars).map(IntStream::boxed).map(x -> x.map(val -> String.valueOf((char) val.intValue())))
//                .count());
        //    map(x -> x.map(val -> String.valueOf((char) val.intValue())))
//    .map(x -> x.filter(val -> val.matches("\\d+")))
//    } System.nanoTime()
        System.out.println(Arrays.stream(arr).
                map(x -> x.chars().filter(Character::isDigit).count()).
                toList().stream().map(Long::intValue).reduce(0, Integer::sum).intValue());

        System.out.println(Arrays.stream(arr).map(x -> x.chars().count()).toList().stream().reduce(0L, Long::sum));
        Set<Integer> sets = new HashSet<>();
        System.out.println(Arrays.toString(Arrays.stream(arr2).filter(x -> !sets.add(x)).toArray()));

        var result = Stream.of(1,2,3,4,5,6);//finite stream
            //    result.forEach(System.out::println);
        var result2 = Stream.empty();
        result2.forEach(System.out::println); //finite stream


       // Stream.generate(()->1+ new Random().nextInt(10)).limit(10).forEach(System.out::println); //infinite stream


//       var streamIterateResult= Stream.iterate(1, (x)->x+1);
//       streamIterateResult.forEach(System.out::println);
        System.out.println(Stream.iterate(1, (x) -> x + 1).anyMatch((number) -> number % 2 != 0));
    }}
