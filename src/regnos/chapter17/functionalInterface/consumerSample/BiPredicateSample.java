package regnos.chapter17.functionalInterface.consumerSample;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        System.out.println("first operation" + biPredicate.test("Tinu", 4));
    }
    static BiPredicate<String, Integer> biPredicate = (name, lengthOfName) -> name.length() == lengthOfName;
}
