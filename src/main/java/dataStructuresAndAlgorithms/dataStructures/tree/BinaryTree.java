package dataStructuresAndAlgorithms.dataStructures.tree;

import java.util.ArrayList;

public class BinaryTree<T> extends Tree {
/***************
 * Instance Variables
 * */
    private ArrayList<T> binaryTreeList;


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
    public ArrayList<T> preOrder(Node root) {
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


    public ArrayList<T> inOrder(Node root) {
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


    public ArrayList<T> postOrder(Node root) {
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
}
