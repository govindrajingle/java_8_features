package consumer_supplier;

import java.util.function.Supplier;

public class SupplierDemo {
    // Supplier is a functional interface that does not take any input but return a
    // value.
    // The abstract method is get()
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello from Supplier";
        System.out.println(supplier.get());
    }
}
