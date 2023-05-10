package regnos.chapter17.functionalInterface.consumerSample;

import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

public class IntConsumerSample {
    public static void main(String[] args) {
        intConsumer.accept(20);
        System.out.println(intBinaryOperator.applyAsInt(2, 50));
    }
    public static IntConsumer intConsumer = System.out::println;
    public static IntBinaryOperator intBinaryOperator= (quantity, price )->quantity*price;
}
