package regnos.chapter16;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

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
       mapExample();
    }
    public static void setEx(){
        Set<Integer> names = new HashSet<>();
        Set<Integer> name = new TreeSet<>();
        int[] array= new int[5];
        array[0]=5; array[1]= 6; array[2]= 2; array[3]= 2;
        for(var i: array){
           names.add(i);
        }


        System.out.println(names);
        System.out.println(names.toArray()[names.toArray().length - 1]);

    }

    public  static void treeSetComparator(){
        Customer customer = new Customer("Zainab", 1, 3_000_000);
        Customer customerOne = new Customer("Professor", 5, 300_000);
        Customer customerTwo = new Customer("Femi", 10, -3_000_000);

        Comparator<Customer> comparator = (c1,c2)->{
            if(c1.getId() < c2.getId()) return 1;
            else if (c2.getId()< c1.getId()) return -1;
            return 0;
        };


//        Set<Customer> customers = new TreeSet<>(Comparator.reverseOrder());
        Set<Customer> customers = new TreeSet<>(comparator);
        customers.add(customer);
        customers.add(customerOne);
        customers.add(customerTwo);

        System.out.println(customers);
    }

    private static void queueEx(){
        Queue<Integer> queue = new PriorityQueue<>(3);
        //Queue<Integer> queue = new ArrayDeque<>(3);
        //Queue<Integer> queue1= new ArrayBlockingQueue<>(3);
        queue.add(11);
        queue.add(2);
        queue.add(3);
        queue.offer(40);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue.peek());

    }

    public static  void mapExample(){
        Map<String, String[]> nigerianStates = new HashMap<>();
        nigerianStates.put("Akwa-ibom", new String[]{"uyo", "benin"});
        nigerianStates.put("Abia", new String[]{"umuahia", "calabar"});

        nigerianStates.forEach((k,v)-> System.out.println(k+":"+ Arrays.toString(v)));
        nigerianStates.keySet().forEach(k->Arrays.sort(nigerianStates.get(k)));

        String[] value = nigerianStates.get("benue");
        System.out.println(Arrays.toString(value));

        nigerianStates.keySet().forEach(k-> System.out.println(k + Arrays.toString(nigerianStates.get(k))));


        //treemap sorts with the key
        Map<String, Integer> people = new TreeMap<>();
        people.put("Zainab", 109);
        people.put("Balablu", 24);
        people.put("Femi", 287);

        System.out.println(people);
    }
}
