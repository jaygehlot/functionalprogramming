package optionals;

import java.util.Optional;

public class MoreOptionals {

    public static void main(String[] args) {
        Optional<Object> emptyOpt = Optional.empty();
        Optional<Object> someNameOpt = Optional.of("Jay");

        if (someNameOpt.isPresent()) {
            System.out.println("hey" + someNameOpt.get());
        } else {
            System.out.println("Hi");
        }

        System.out.println("=====================");

        someNameOpt.ifPresentOrElse(name -> System.out.println("Hey" + name),
                () -> System.out.println("Hi"));


        System.out.println("=====================");

        System.out.println("Hey" + someNameOpt.orElse("Hi"));

    }
}
