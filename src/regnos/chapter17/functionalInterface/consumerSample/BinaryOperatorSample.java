package regnos.chapter17.functionalInterface.consumerSample;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {
        System.out.println(binaryOperator.apply("Tinu", "Bell"));
    }
    static BinaryOperator<String> binaryOperator = (firstName, lastName)-> firstName +" "+ lastName;
}
