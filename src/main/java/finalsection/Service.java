package finalsection;

import java.util.function.BiFunction;

public class Service {

    //name   age      return type             (need parentheses, with multiple arguments)
    BiFunction<String, Integer, String> usingBiFunction = (name, age) -> {
        //logic here
        if (name.isEmpty()) throw new IllegalArgumentException("Blank name!");
        System.out.println(age);
        return name.toUpperCase();
    };
}
