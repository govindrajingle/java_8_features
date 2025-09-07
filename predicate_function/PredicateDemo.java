package predicate_function;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    // We have Predicate as a functional interface, meaning that only one abstract
    // method
    // (test()) and can refer the lambda expression.

    // The test() method takes arguments and returns only boolean value.
    public static void main(String[] args) {
        int y = 100;
        Predicate<Integer> isEven = x -> x % 2 == 0;
        Predicate<Integer> isGreaterThan = x -> x >= 100;

        // Predicate Chaining (combine and, or, negate)
        Predicate<Integer> isEvenAndGreaterThan = isEven.and(isGreaterThan);

        System.out.println("Is " + y + " Even Number : " + isEven.test(y));
        System.out.println(
                "Is " + y + " Greater Than or Equal to 100 and Even Number: " + isEven.and(isGreaterThan).test(y));

        // We have the BiPredicate functional interface also which takes two arguments
        BiPredicate<String, Integer> checkLength = ((str, num) -> str.length() == num);
        System.out.println(checkLength.test("Hello, World", 12));
    }
}
