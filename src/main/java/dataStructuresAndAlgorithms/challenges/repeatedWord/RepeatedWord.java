package dataStructuresAndAlgorithms.challenges.repeatedWord;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWord {
    public static String findTheRepeatedWord(String string) {
        try {
            // This code inspired by https://stackoverflow.com/questions/7488643/how-to-convert-comma-separated-string-to-arraylist
            String[] originalWords = string.toLowerCase().split(" ");

            //This code inspired by https://stackoverflow.com/questions/4820716/finding-repeated-words-on-a-string-and-counting-the-repetitions
            Map<String, Integer> repeats = new HashMap<>();

            for (String word : originalWords) {
                Integer count = repeats.get(word);

                if (count == null) count = 0;

                repeats.put(word, ++count);
            }

            for (String word : repeats.keySet()) {
                if (repeats.get(word) > 1) return word;

            }
        } catch (Exception error) {
            System.out.println("An error has occurred: " + error);
        }

        return null;
    }
}
