package dataStructuresAndAlgorithms.challenges.multiBracketValidation;

import dataStructuresAndAlgorithms.dataStructures.stacksAndQueues.Stack;

import java.util.ArrayList;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input) {
        try {
            if (input.length() % 2 != 0) {
                return false;
            }

            String[] chars = input.split("");
            Stack brackets = new Stack();

            for (int i = 0; i < input.length(); i++) {
                if (chars[i] == "{" || chars[i] == "(" || chars[i] == "["  ) {
                    brackets.push(chars[i]);
                } else if (chars[i] == "}" || chars[i] == ")" || chars[i] == "]") {
                    if (brackets.getSize() == 0) {
                        return false;
                    } else {
                        if (chars[i] == "{" && brackets.peek() == "}" ||
                            chars[i] == "(" && brackets.peek() == ")" ||
                            chars[i] == "[" && brackets.peek() == "]") {
                            brackets.pop();
                        } else {
                            return false;
                        }
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("An error has occurred: " + e);
        }
        return false;
    }
}
