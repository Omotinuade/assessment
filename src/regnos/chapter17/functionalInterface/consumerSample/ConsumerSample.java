package regnos.chapter17.functionalInterface.consumerSample;

public class Consumer {
    public static void main(String[] args) {
        java.util.function.Consumer<String> twice = consumerDeclarative.andThen(after);
        twice.accept("Hello world");
    }
    public  static java.util.function.Consumer<String> consumerDeclarative = System.out::println;
    public  static java.util.function.Consumer<String> after = name -> System.out.println(name.length());
}
