package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MoreStreams {

    public static void main(String[] args) {

        //Stream is nothing but a sequence of items

        Stream<String> fruits = Stream.of("bananas", "apples", "oranges", "pineapples");


        //from an array

        var moreFruits = new String[] {"bananas", "apples", "oranges", "pineapples"};
        Stream<String> stream = Arrays.stream(moreFruits);

        //from list

        List<String> someMoreFruits = List.of("bananas", "apples", "oranges", "pineapples");
        Stream<String> fruity = someMoreFruits.stream();

        fruity.forEach(System.out::println);
        //someMoreFruits.parallelStream().forEach(System.out::println);

        //Match
        System.out.println(fruits.anyMatch(item-> item.contains("avocados")));

        //Filter - https://www.baeldung.com/java-stream-operated-upon-or-closed-exception
        Supplier<Stream<String>> itemsInAisle = someMoreFruits::stream;
        itemsInAisle.get().filter(item -> item.startsWith("p")).forEach(System.out::println);

        //Map
        List<Integer> integers = List.of(2, 4, 6, 8, 3, 1, 9);
        Stream<Integer> streamOfInts = integers.stream().map(num -> num * 3);
        streamOfInts.forEach(System.out::println);

    }
}
