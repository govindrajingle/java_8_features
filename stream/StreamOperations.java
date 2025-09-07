package stream;

import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        System.out.println("Stream Operations Demo");
        Employee emp1 = new Employee(1, "Alice", 50000);
        Employee emp2 = new Employee(2, "Bob", 60000);

        List<Employee> employees = List.of(emp1, emp2);
        List<Integer> numbers = List.of(41, 22, 31, 36, 45);

        numbers.stream()
                .sorted((a, b) -> a.compareTo(b))
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        employees.stream()
                .sorted((a, b) -> a.name.compareTo(b.name))
                .forEach(x -> System.out.print(x + " "));

        System.out.println();

        int maxNumber = numbers.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println("Maximum Number: " + maxNumber);

        int minNumber = numbers.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println("Minimum Number: " + minNumber);
    }
}

class Employee {
    int id;
    String name;
    Integer salary;

    public Employee(int id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}
