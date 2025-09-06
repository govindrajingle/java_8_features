package predicate_function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        // Just like the predicate the Funtion is a interface meaning that having one
        // abstract method and we can use lambda expression to implement the method of
        // the interface
        // Function<T,R> T is the input type and R is the return type
        // Method name is apply()

        String name = "Govindraj";
        Function<String, Integer> operation = x -> x.length();
        System.out.println("The length of the string is : " + operation.apply(name));

        // Same we can chain the functions using andThen() and compose() methods

        Function<String, Integer> square = x -> x.length() * x.length();
        Function<Integer, Integer> doubleIt = x -> x * 2;
        System.out.println("The length of the string squared and doubled is : " + square.andThen(doubleIt).apply(name));
    }
}
