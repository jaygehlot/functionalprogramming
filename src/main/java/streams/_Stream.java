package streams;

import java.util.List;
import java.util.function.Predicate;

import static streams._Stream.Gender.*;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alice", FEMALE),
                new Person("Alex", MALE),
                new Person("Bob", PREFER_NOT_TO_SAY)
        );

        people.stream()
            .map(Person::getName)
            .mapToInt(String::length)
            //.collect(Collectors.toSet())
            .forEach(System.out::println);

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.getGender());
        boolean containsOnlyFemales = people.stream()
                .anyMatch(personPredicate);

        System.out.println("Are there only females in the list? : " + containsOnlyFemales);

    }

    private static class Person {
        private final String name;
        private final Gender gender;

        private Person(String mame, Gender gender) {
            this.name = mame;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "mame='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
