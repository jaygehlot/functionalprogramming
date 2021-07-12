package strings;

import java.util.Locale;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PalindromeChecker {

    public static void main(String[] args) {
        System.out.println(isPalindrome("civic"));
        System.out.println(isPalindromeCheckerApproach2("civic"));
        System.out.println(isPalindromeCheckerApproach3("civic"));
        System.out.println(isPalindromeCheckerApproach3("aBba"));
        System.out.println(isPalindromeCheckerApproach3("swims"));
        System.out.println(isPalindromeCheckerApproach3("wifI   "));
    }

    private static boolean isPalindrome(String text) {
        String lowerCaseString = text.toLowerCase();
        String reversedString = new StringBuilder(lowerCaseString).reverse().toString();
        return lowerCaseString.equals(reversedString);
    }

    private static boolean isPalindromeCheckerApproach2(String text) {
        String normalized = text.toLowerCase();
        StringBuilder reversed = new StringBuilder();

        for(int i=normalized.length() -1; i>=0; i--) {
            reversed.append(normalized.charAt(i));
        }
        return normalized.equals(reversed.toString());
    }

    private static boolean isPalindromeCheckerApproach3(String text) {
        String normalized = text.toLowerCase();

        IntStream range = IntStream.range(0, normalized.length() / 2);
        IntPredicate intPredicate = i -> normalized.charAt(i) == normalized.charAt(normalized.length() - i - 1);
        return range.allMatch(intPredicate);
    }
}
