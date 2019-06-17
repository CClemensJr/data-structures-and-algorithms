package dataStructuresAndAlgorithms;

import dataStructuresAndAlgorithms.challenges.arrayBinarySearch.BinarySearch;
import dataStructuresAndAlgorithms.dataStructures.tree.BinaryTree;
import dataStructuresAndAlgorithms.dataStructures.tree.Node;
import dataStructuresAndAlgorithms.dataStructures.tree.Tree;
import org.junit.Test;
import static org.junit.Assert.*;

public class TreeTest {
    @Test
    public void canSuccessfullyInstantiateAnEmptyTree() {
        Tree test = new Tree();

        assertNull(test.getRoot());
    }


    @Test
    public void canSuccessfullyInstantiateAnEmptyBinaryTree() {
        BinaryTree test = new BinaryTree();

        assertNull(test.getRoot());
    }


    @Test
    public void canSuccessfullyInstantiateATreeWithASingleRootNode() {
        Tree test = new Tree("I tested this");

        assertTrue(test.getRoot().getValue() == "I tested this");
    }


    @Test
    public void canSuccessfullyInstantiateABinaryTreeWithASingleRootNode() {
        BinaryTree test = new BinaryTree("I tested this");

        assertTrue(test.getRoot().getValue() == "I tested this");
    }

    @Test
    public void canSuccessfullyAddALeftChildAndRightChildToASingleRootNode() {
        Tree test = new Tree("This is the root node.");

        test.getRoot().setLeftChild("This is the left child");
        test.getRoot().setRightChild("This is the right child");

        assertTrue(test.getRoot().getLeftChild().getValue() == "This is the left child");
        assertTrue(test.getRoot().getRightChild().getValue() == "This is the right child");
    }

    @Test
    public void canSuccessfullyAddALeftAndRightTreesToSingleRootNode() {
        BinaryTree test = new BinaryTree("This is the root node");

        Node left = new Node("This is the left node");
        Node leftLeft = new Node("This is the left left node");
        Node leftRight = new Node("This is the left right node");

        Node right = new Node("This is the right node");
        Node rightLeft = new Node("This is the right left node");
        Node rightRight = new Node("This is the right right node");

        test.getRoot().setLeftChild(left);

//        left.getRoot().setLeftChild(leftLeft);
//        left.getRoot().setRightChild(leftRight);
//
//        right.getRoot().setLeftChild(rightLeft);
//        right.getRoot().setRightChild(rightRight);
//
//        test.getRoot().setLeftChild(left);
//        test.getRoot().setRightChild(right);

        assertTrue(test.getRoot().getValue() == "This is the root node");
    }

    @Test
    public void canSuccessfullyReturnACollectionFromAPreorderTraversal() {


    }
//    Can successfully return a collection from an inorder traversal
//    Can successfully return a collection from a postorder traversal
}
