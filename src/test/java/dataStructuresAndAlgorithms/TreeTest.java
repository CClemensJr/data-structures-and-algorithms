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

        test.addNode("This is the left child");
        test.addNode("This is the right child");

        assertTrue(test.getRoot().getLeftChild().getValue() == "This is the left child");
        assertTrue(test.getRoot().getRightChild().getValue() == "This is the right child");
    }



    @Test
    public void canSuccessfullyReturnACollectionFromAPreorderTraversal() {


    }
//    Can successfully return a collection from an inorder traversal
//    Can successfully return a collection from a postorder traversal
}
