package dataStructuresAndAlgorithms.challenges.fizzBuzzTree;

import dataStructuresAndAlgorithms.dataStructures.tree.BinaryTree;
import java.util.List;

public class FizzBuzzTree<T> {

    public BinaryTree fizzBuzzTree(BinaryTree tree) {
        try {
            List<T> nodes = tree.preOrder(tree.getRoot());

            for (T node : nodes) {
                System.out.println(node);
            }
        } catch (Exception e) {
            System.out.println("An error has occurred: " + e);
        }

        return null;
    }
}
