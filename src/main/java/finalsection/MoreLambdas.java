package finalsection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class MoreLambdas {

    public static void main(String[] args) {
        List<String> students = List.of("Sally", "Polly", "Jane", "Oscar");

        //Lamdbas - iterating through list or conditional optionals

        //Consumer
        Consumer<String> stringConsumer = System.out::println;
        students.forEach(stringConsumer);

        //Predicate
        IntPredicate isDivisibleByThree = n -> n % 3 == 0;
        System.out.println(isDivisibleByThree.test(3));
        System.out.println(isDivisibleByThree.test(4));

        //Supplier - takes no input but produces an output
        Supplier<Double> randomNumberUnder100 = () -> Math.random() * 100;
        System.out.println(randomNumberUnder100.get());

        //Function
        Function<Integer, Integer> doubly = n -> n * n;
        System.out.println(doubly.apply(8));
    }
}
