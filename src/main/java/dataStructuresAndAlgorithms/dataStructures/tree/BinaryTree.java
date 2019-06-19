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

            queue.enqueue();

        } catch(Exception e) {
            System.out.println("An error has occurred: " + e);
        }

        return null;
    }
}
