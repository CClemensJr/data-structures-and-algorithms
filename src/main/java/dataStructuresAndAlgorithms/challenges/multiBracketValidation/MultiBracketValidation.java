package dataStructuresAndAlgorithms.challenges.multiBracketValidation;

import dataStructuresAndAlgorithms.dataStructures.stacksAndQueues.Stack;

import java.util.ArrayList;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input) {
        try {
            if (input.length() % 2 != 0) {
                return false;
            }
//            Stack brackets = new Stack();
//            ArrayList<char> chars = input.split("");
        } catch (Exception e) {
            System.out.println("An error has occurred: " + e);
        }
        return false;
    }
}
