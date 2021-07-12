package strings;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VowelsAndConsonants {
    public static void main(String[] args) {
//        vowelsAndCosonants("I am happy");
//        vowelsAndCosonants("HellO");
//        vowelsAndCosonants("there is a quiet Mouse");
//
//        vowelsAndCosonantsUsingStreams("I am happy");
//        vowelsAndCosonantsUsingStreams("HellO");
//        vowelsAndCosonantsUsingStreams("there is a quiet Mouse");

        vowelsAndCosonantsUsingAnotherStreamsApproach("I am happy");
    }

    /**
     * a, e, i, o, u, y -> vowels
     * Everthing else is a consonant
     * @param inputString
     */
    private static void vowelsAndCosonants(final String inputString) {
        char[] chars = inputString.replaceAll("\\s+","").toCharArray();
        int vowelCount = 0;
        int consonontCount = 0;
        for(int i=0; i < chars.length; i++) {
            if(("aeiouyAEIOUY".indexOf(chars[i]) != -1)) {
                vowelCount++;
            } else {
                consonontCount++;
            }
        }
        System.out.println(inputString + " has the following");
        System.out.println("Vowels are :" + vowelCount);
        System.out.println("Consonants are :" + consonontCount);
    }

    /**
     * a, e, i, o, u, y -> vowels
     * Everthing else is a consonant
     * @param inputString
     */
    private static void vowelsAndCosonantsUsingStreams(final String inputString) {
        String vowels = "aeiouy";
        String normalize = inputString.toLowerCase().trim();

        List<Integer> letters = normalize
                .chars()
                .filter(Character::isAlphabetic)
                .boxed()
                .collect(Collectors.toList());

        long vowelsCount = letters.stream().filter(c -> vowels.indexOf(c) !=  -1)
                .count();

        long consonantCount = letters.stream().count() - vowelsCount;

        System.out.println(inputString + " has the following");
        System.out.println("Vowels are :" + vowelsCount);
        System.out.println("Consonants are :" + consonantCount);
    }

    private static void vowelsAndCosonantsUsingAnotherStreamsApproach(final String inputString) {
        IntPredicate isVowel = argument -> argument == 'a' || argument == 'i' || argument == 'e' ||
                argument == 'o' || argument == 'u' || argument == 'y';

        String normalised = inputString.replaceAll("\\s+", "").toLowerCase().trim();

        long vowelsCount = normalised.chars().filter(isVowel).count();
        long consonantsCount = normalised.length() - vowelsCount;

        System.out.println(inputString + " has the following");
        System.out.println("Vowels are :" + vowelsCount);
        System.out.println("Consonants are :" + consonantsCount);

        System.out.println(List.of("Jay", "Mark", "Matt"));
    }
}
