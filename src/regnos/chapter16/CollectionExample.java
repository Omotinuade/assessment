package regnos.chapter16;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionExample {
    public static void list(){
        List<Integer> nums= new ArrayList<>(3);
        nums.add(1);
        nums.add(200);
        nums.remove(0);
        System.out.println(nums);
        nums.add(0, 20);
        System.out.println(nums);

        Collections.reverse (nums);
        System.out.println(nums);

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);

        List<String> words= Arrays.asList("james", "tinu");

        List<String> names = List.of("james");

        LinkedList<String> l = new LinkedList<>();
        l.add("Malik"); l.add("Folahan");
        //linkedlist stores element in nodes with reference to the prev and the next
    }

    public static void main(String[] args) {
        setEx();
    }
    public static void setEx(){
        Set<Integer> names = new HashSet<>();
        int[] array= new int[5];
        array[0]=5; array[1]= 6; array[2]= 2; array[3]= 2;
        for(var i: array){
           names.add(i);
        }

        System.out.println(names);
        System.out.println(names.toArray()[names.toArray().length - 1]);

    }
}
