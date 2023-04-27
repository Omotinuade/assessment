package regnos.chapter17.functionalInterface.consumerSample;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {
    public static void main(String[] args) {

    }
    static BinaryOperator<String> binaryOperator = (firstName, lastName)-> firstName +" "+ lastName;
}
