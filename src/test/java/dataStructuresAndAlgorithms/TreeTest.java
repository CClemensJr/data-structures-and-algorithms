package dataStructuresAndAlgorithms;

import dataStructuresAndAlgorithms.challenges.arrayBinarySearch.BinarySearch;
import dataStructuresAndAlgorithms.dataStructures.tree.BinarySearchTree;
import dataStructuresAndAlgorithms.dataStructures.tree.BinaryTree;
import dataStructuresAndAlgorithms.dataStructures.tree.Node;
import dataStructuresAndAlgorithms.dataStructures.tree.Tree;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TreeTest {
/**********
 * Tree Tests
 * */
    @Test
    public void canSuccessfullyInstantiateAnEmptyTree() {
        Tree test = new Tree();

        assertNull(test.getRoot());
    }

    @Test
    public void canSuccessfullyInstantiateATreeWithASingleRootNode() {
        Tree test = new Tree("I tested this");

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



/**********
 * Binary Tree Tests
 * */
    @Test
    public void canSuccessfullyInstantiateAnEmptyBinaryTree() {
        BinaryTree test = new BinaryTree();

        assertNull(test.getRoot());
    }

    @Test
    public void canSuccessfullyInstantiateABinaryTreeWithASingleRootNode() {
        BinaryTree test = new BinaryTree("I tested this");

        assertTrue(test.getRoot().getValue() == "I tested this");
    }

    @Test
    public void canSuccessfullyReturnACollectionFromAPreorderTraversal() {
        BinaryTree test = new BinaryTree("This is the root node");

        test.addNode("This is the left child");
        test.addNode("This is the right child");

        ArrayList<String> expected = new ArrayList<String>();

        expected.add("This is the root node");
        expected.add("This is the left child");
        expected.add("This is the right child");

        assertEquals(expected, test.preOrder(test.getRoot()));
    }


    @Test
    public void canSuccessfullyReturnACollectionFromAnInorderTraversal() {
        BinaryTree test = new BinaryTree("This is the root node");

        test.addNode("This is the left child");
        test.addNode("This is the right child");

        ArrayList<String> expected = new ArrayList<String>();

        expected.add("This is the left child");
        expected.add("This is the root node");
        expected.add("This is the right child");

        assertEquals(expected, test.inOrder(test.getRoot()));
    }


    @Test
    public void canSuccessfullyReturnACollectionFromAPostorderTraversal() {
        BinaryTree test = new BinaryTree("This is the root node");

        test.addNode("This is the left child");
        test.addNode("This is the right child");

        ArrayList<String> expected = new ArrayList<String>();

        expected.add("This is the left child");
        expected.add("This is the right child");
        expected.add("This is the root node");

        assertEquals(expected, test.postOrder(test.getRoot()));
    }


    @Test
    public void canSuccessfullyReturnACollectionFromABreadthFirstTraversal() {
        BinaryTree test = new BinaryTree("This is the root node");

        test.addNode("This is the left child");
        test.addNode("This is the right child");

        ArrayList<String> expected = new ArrayList<String>();

        expected.add("This is the root node");
        expected.add("This is the left child");
        expected.add("This is the right child");

        assertEquals(expected, test.breadthFirst(test.getRoot()));
    }

    @Test
    public void canSuccessfullyTheMaximumValue() {
        BinaryTree test = new BinaryTree(17);

        test.addNode(29);
        test.addNode(46);

        int expected = 46;

        assertEquals(expected, test.getMaximumValue(test.getRoot()));

    }


/**********
 * Binary Search Tree Tests
 * */
    @Test
    public void canSuccessfullyReturnTrueIfValueInTree() {
        BinarySearchTree test = new BinarySearchTree(17);

        test.addNode(29);
        test.addNode(46);

        boolean expected = true;

        assertEquals(expected, test.contains(46));

    }
}
