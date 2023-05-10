package regnos.chapter17.functionalInterface.consumerSample;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        //System.out.println(predicate.test(5));
        Predicate<Integer> and = predicate.or(other);
        System.out.println(and.test(11));
    }
    static Predicate<Integer> predicate = input -> input % 2 ==0;
    static Predicate<Integer> other = input -> input <= 5;
}
