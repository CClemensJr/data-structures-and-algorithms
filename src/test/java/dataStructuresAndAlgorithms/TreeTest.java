package dataStructuresAndAlgorithms;

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
    public void canSuccessfullyInstantiateATreeWithASingleRootNode() {
        Tree test = new Tree("I tested this");

        assertTrue(test.getRoot().getValue() == "I tested this");
    }
    @Test
    public void canSuccessfullyAddALeftChildAndRightChildToASingleRootNode() {
        Tree test = new Tree("This is the root node.");

        test.setLeft("This is the left child");
        test.setRight("This is the right child");
    }
//    Can successfully return a collection from a preorder traversal
//    Can successfully return a collection from an inorder traversal
//    Can successfully return a collection from a postorder traversal
}
