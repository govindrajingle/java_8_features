package stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    // Stream is class which is used to process collections of objects like List,
    // Set etc. It is basically advanced iterator.
    // Then comes the second part of Stream that is Configuaraion of stram using
    // intermediate operations like filter, map
    // Filter is prdicate which is used to filter the elements and map is function
    // Last we have to process the configurated stream using terminal operations
    // like forEach, collector, count etc.
    public static void main(String[] args) {
        List<String> names = List.of("Java", "Python", "JavaScript", "C++", "Ruby", "Go", "Swift");
        filterExample(names);
        System.out.println("Using Stream API");

        // Configuration of stream using filter (intermediate operation))
        names.stream().filter((x) -> x.startsWith("J") && x.length() < 19);

        // Processing of stream using forEach (terminal operation)
        names.stream().filter(x -> x.startsWith("J") && x.length() < 19).forEach(System.out::println);

        // Map Example
        names.stream().map(x -> x.toUpperCase()).forEach(System.out::println);

    }

    // Traditional Way
    private static void filterExample(List<String> names) {
        for (String name : names) {
            if (name.length() > 3 && name.startsWith("J")) {
                // System.out.println(name);
            }
        }
    }
}
