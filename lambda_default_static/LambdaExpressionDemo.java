public class LambdaExpressionDemo {
    public static void main(String[] args) {
        // This is wihout lambda expression
        Test test = new Test();
        var result = test.add(12, 32);
        System.out.println("Result: " + result);
        // This is with lambda expression
        // To refer the lambda expression, we need to create a functional interface
        Addable addable = (a, b) -> a + b;
        var lambdaResult = addable.add(23, 32);
        System.out.println("Lambda Result: " + lambdaResult);
        // We can also use method reference to refer the method of a class

        // The class doesn’t need to implement the interface; the compiler just matches
        // the method signature with the functional interface’s single abstract method.
        Addable addable1 = test::add;
        // If the method is static, we can refer it using the class name. (Test :: add)
        var methodRefResult = addable1.add(45, 32);
        System.out.println("Method Reference Result: " + methodRefResult);

    }
}

@FunctionalInterface
interface Addable {
    int add(int a, int b);
}

class Test {
    public int add(int a, int b) {
        return a + b;
    }
}