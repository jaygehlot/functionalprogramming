package anagrams;

public class Main {
    public static void main(String[] args) {
        String oneWord = "cinema";
        String twoWord = "iceman";
        Anagram anagram = new Anagram();
        System.out.println(anagram.isWordsEqual(oneWord, twoWord) && anagram.isWordsEqual(oneWord, twoWord));
    }
}
