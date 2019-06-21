package dataStructuresAndAlgorithms.challenges.multiBracketValidation;

import dataStructuresAndAlgorithms.dataStructures.stacksAndQueues.Stack;

public class MultiBracketValidation {

    // This solution was influenced by a solution on The Polyglot Developer
    public static boolean multiBracketValidation(String input) {
        try {
            if (input.length() % 2 != 0) { return false; }

            String[] chars = input.split("");
            Stack bracketStack = new Stack();

            for (int i = 0; i < input.length(); i++) {
                if (chars[i] == "{" || chars[i] == "(" || chars[i] == "["  ) {
                    bracketStack.push(chars[i]);
                } else if (chars[i] == "}" || chars[i] == ")" || chars[i] == "]") {
                    if (bracketStack.getSize() == 0) {
                        return false;
                    } else {
                        if (chars[i] == "{" && bracketStack.peek() == "}" ||
                            chars[i] == "(" && bracketStack.peek() == ")" ||
                            chars[i] == "[" && bracketStack.peek() == "]") {

                            bracketStack.pop();
                        } else {
                            return false;
                        }
                    }
                }
            }

            return true;
        } catch (Exception e) {
            System.out.println("An error has occurred: " + e);
        }

        return false;
    }
}
