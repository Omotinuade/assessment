package regnos.chapter17.functionalInterface.consumerSample;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionSample {
    public static void main(String[] args) {
        System.out.println(function.apply(3, 2));
        var result=function.andThen(function1);
        result.apply(1,2);
    }
    static BiFunction<Integer, Integer, String> function = (one, two)-> one * two +" ";
    static Function<String, String > function1 = (age)->  age +" years old";
}
