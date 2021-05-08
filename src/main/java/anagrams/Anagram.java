package anagrams;

import java.util.Arrays;

public class Anagram {

    public boolean isWordsEqual(final String firstWord, final String secondWord) {
        return (firstWord.length() == secondWord.length());
    }

    public boolean isCharsSame(final String firstWord, final String secondWord) {
        char[] first = firstWord.toCharArray();
        char[] second = secondWord.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }
}
