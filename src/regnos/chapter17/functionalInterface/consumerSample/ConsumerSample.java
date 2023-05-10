package regnos.chapter17.functionalInterface.consumerSample;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
//        Consumer<String> twice = consumerDeclarative.andThen(after);
//        twice.accept("Hello world");
        after.accept("Tinu Bell", 12);
    }
    public  static Consumer<String> consumerDeclarative = System.out::println;
    public  static BiConsumer<String, Integer> after = (name, age) -> {
        var result = name.split(" ");
        System.out.println(result[0].length() +" "+ age);

    };
}
