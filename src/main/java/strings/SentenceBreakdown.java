package strings;

import java.util.Arrays;

public class SentenceBreakdown {
    public static void main(String[] args) {
        String text = "The giant panda has an insatiable appetite for bamboo. " +
                "A typical animal eats half the day-a full 12 out of 24 " +
                "hours-and relieves itself dozens of times a day. It takes 28 " +
                "pounds of bamboo to satisfy a giant panda's daily dietary needs. " +
                "Pandas will sometimes eat birds or rodents as well.";

        String[] split = text.split("\\. ");
        System.out.println(split[1]);

        String[] words = text.split(" |-");
        System.out.println("Text has words " + words.length);

        System.out.println(Arrays.asList(words));

        System.out.println("Text has " + text.length() + " characters");
    }
}
