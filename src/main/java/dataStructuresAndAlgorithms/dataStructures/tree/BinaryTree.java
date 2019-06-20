package dataStructuresAndAlgorithms.dataStructures.tree;

import java.util.ArrayList;
import java.util.List;
import dataStructuresAndAlgorithms.dataStructures.stacksAndQueues.Queue;

public class BinaryTree<T> extends Tree {
/***************
 * Instance Variables
 * */
    private List<T> binaryTreeList;


/***************
 * Constructors
 * */
    public BinaryTree() { binaryTreeList = new ArrayList<>(); }

    public BinaryTree(T value) {
        binaryTreeList = new ArrayList<>();

        this.setRoot(value);
    }


/***************
 * Getters / Setters
 * */


/***************
 * Instance methods
 * */
    public List<T> preOrder(Node root) {
        try {
            this.binaryTreeList.add((T) root.getValue());

            if (root.getLeftChild() != null) preOrder(root.getLeftChild());
            if (root.getRightChild() != null) preOrder(root.getRightChild());

            return this.binaryTreeList;

        } catch(Exception e) {
            System.out.println("An error has occurred: " + e);
        }

        return null;
    }


    public List<T> inOrder(Node root) {
        try {
            if (root.getLeftChild() != null) preOrder(root.getLeftChild());

            this.binaryTreeList.add((T) root.getValue());

            if (root.getRightChild() != null) preOrder(root.getRightChild());

            return this.binaryTreeList;

        } catch(Exception e) {
            System.out.println("An error has occurred: " + e);
        }

        return null;
    }


    public List<T> postOrder(Node root) {
        try {
            if (root.getLeftChild() != null) preOrder(root.getLeftChild());

            if (root.getRightChild() != null) preOrder(root.getRightChild());

            this.binaryTreeList.add((T) root.getValue());

            return this.binaryTreeList;

        } catch(Exception e) {
            System.out.println("An error has occurred: " + e);
        }

        return null;
    }


    public List<T> breadthFirst(Node root) {
        try {
            Queue queue = new Queue();

            queue.enqueue(root);

            while (queue.peek() != null) {
                Node front = (Node) queue.dequeue();

                this.binaryTreeList.add((T) front.getValue());
                System.out.println(front.getValue());

                if (front.getLeftChild() != null) queue.enqueue(front.getLeftChild());
                if (front.getRightChild() != null) queue.enqueue(front.getRightChild());
            }

            return this.binaryTreeList;

        } catch(Exception e) {

            System.out.println("An error has occurred: " + e);
        }

        return null;
    }


    // Found a similar solution on geeksforgeeks
    public int getMaximumValue(Node node) {
        try {
            int maxValue = (int) node.getValue();
            int leftValue = getMaximumValue(node.getLeftChild());
            int rightValue = getMaximumValue(node.getRightChild());

            if (leftValue > maxValue) maxValue = leftValue;
            if (rightValue > maxValue) maxValue = rightValue;

            return maxValue;

        } catch(Exception e) {

            System.out.println("An error has occurred: " + e);
        }

        return 0;
    }
}
