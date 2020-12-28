package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice",
                                        "alice@gmail.com",
                                        "+004445545454",
                                        LocalDate.of(2000, 1, 1));

        System.out.println(new CustomerValidatorService().isValid(customer));

        Customer invalidCustomer = new Customer("Alice",
                                                "alice@gmail.com",
                                                "004445545454",
                                                LocalDate.of(2000, 1, 1));

        System.out.println(new CustomerValidatorService().isValid(invalidCustomer));

        // using combinator pattern

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(invalidCustomer);

        System.out.println("Combinator pattern : " + result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
