package regnos.chapter17.functionalInterface.consumerSample;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
       // System.out.println(function.apply("Whose"));
        //System.out.println(function1.apply(10));
        var result = function1.andThen(function);
        System.out.println(result.apply(5));
    }
    static Function<String, Integer> function = String::length;
    static Function<Integer, String> function1 = input-> input * 20 +"";

}
