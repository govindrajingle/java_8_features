package consumer_supplier;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {
    // Consumer is functional interface which takes one argument and returns
    // nothing.
    // Biconsumne is functional interface whic takes two arguments and returns
    // nothing.
    // The abstract method is accept()
    public static void main(String[] args) {
        Consumer<String> name = (str) -> System.out.println("Consumer only accepts does not return : " + str);
        name.accept("Hello, Govindraj");
        BiConsumer<String, Integer> nameAndString = (str, num) -> System.out
                .println("Biconsumer accepts two arguments and returns nothing : " + str + " " + num);
        nameAndString.accept("Govindraj", 25);
    }
}
