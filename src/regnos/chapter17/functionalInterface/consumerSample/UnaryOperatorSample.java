package regnos.chapter17.functionalInterface.consumerSample;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        System.out.println(unary.apply(2));

    }
    static UnaryOperator<Integer> unary =value -> value * 30;
}
