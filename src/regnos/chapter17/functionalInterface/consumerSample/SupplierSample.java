package regnos.chapter17.functionalInterface.consumerSample;

import java.security.SecureRandom;
import java.util.function.Supplier;

public class SupplierSample {
    public static void main(String[] args) {
        System.out.println(supplier.get());
    }
    static Supplier<Integer> supplier = () -> {
        SecureRandom random = new SecureRandom();

        return random.nextInt(10);
    };
}
