package regnos.chapter17.functionalInterface.consumerSample;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        biConsumer.accept("Felix", 20);
    }
   static BiConsumer<String, Integer> biConsumer = (name, age)-> System.out.println(name + " "+ age);

}
