package regnos.chapter17.functionalInterface.consumerSample;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
         BiConsumer<String, Integer> andThen = biConsumer.andThen(after);
        andThen.accept("Felix", 20);
    }
   static BiConsumer<String, Integer> biConsumer = (name, age)-> System.out.println(name + " "+ age);
    static BiConsumer<String, Integer> after = (name, age)-> System.out.println(name + " "+ age*2);
}
