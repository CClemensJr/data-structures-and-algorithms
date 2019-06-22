package dataStructuresAndAlgorithms.challenges.fizzBuzzTree;

import dataStructuresAndAlgorithms.dataStructures.tree.*;
import java.util.List;


public class FizzBuzzTree<T> {

    public static void fizzBuzzTree(BinaryTree tree) {
        try {
//            List nodes = tree.preOrder(tree.getRoot());
//            BinaryTree newTree = new BinaryTree();
//
//            for (Object node : nodes) {
//                if ((int) node % 5 == 0 && (int) node % 3 == 0 ) { node = "FizzBuzz"; }
//                if ((int) node % 3 == 0) { node = "Fizz"; }
//                if ((int) node % 5 == 0) { node = "Buzz"; }
//
//                newTree.addNode(node);
//            }
//
//            return newTree;

            // If the tree isn't null, send the root node to fizzbuzznode
            if (tree != null) fizzBuzzNode(tree.getRoot());
        } catch (Exception e) {
            System.out.println("An error has occurred: " + e);
        }

//        return null;
    }


    public static void fizzBuzzNode(Node root) {
        // if root isn't null
        if(root != null) {
            // Set the value of root equal to the value returned from the fizzBuzz method
            root.setValue(fizzBuzz(root.getValue()));
            // Then use recursion to continue traversing down the tree
            fizzBuzzNode(root.getLeftChild());
            fizzBuzzNode(root.getRightChild());
        }
    }


    public static Object fizzBuzz(Object value) {
        try {
            if ((int) value % 5 == 0 && (int) value % 3 == 0 ) { value = "FizzBuzz"; }
            else if ((int) value % 3 == 0) { value = "Fizz"; }
            else if ((int) value % 5 == 0) { value = "Buzz"; }

            return value;

        } catch (Exception e) {
            System.out.println("An error has occurred: " + e);
        }
    }
}
