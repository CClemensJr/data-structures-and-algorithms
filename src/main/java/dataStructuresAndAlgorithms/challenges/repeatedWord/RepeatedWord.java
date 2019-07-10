package dataStructuresAndAlgorithms.challenges.repeatedWord;

import java.util.ArrayList;

import java.util.List;

public class RepeatedWord {
    public static String findTheRepeatedWord(String string) {
        // This code inspired by https://stackoverflow.com/questions/7488643/how-to-convert-comma-separated-string-to-arraylist
        String[] originalWords = string.split("\\s*,\\s*");

        List<String> uniqueWords = new ArrayList<>();

        for (String word : originalWords) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            } else {
                return word;
            }
        }

        return null;
    }
}
