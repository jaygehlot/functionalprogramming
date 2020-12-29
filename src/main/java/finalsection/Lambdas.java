package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Service service = new Service();
        System.out.println(service.usingBiFunction.apply("jay", 39));
    }

    Function<String, String> upperCase = name -> name.toUpperCase();

    // if we have more logic              (don't need parentheses)
    Function<String, String> doSomeLogic = name -> {
        //logic here
        if (name.isEmpty()) throw new IllegalArgumentException("Blank name!");
        //but will need to return something
        return name.toUpperCase();
    };

}
