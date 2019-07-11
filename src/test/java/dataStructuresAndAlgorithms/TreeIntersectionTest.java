package dataStructuresAndAlgorithms;

import dataStructuresAndAlgorithms.challenges.treeIntersection.TreeIntersection;
import dataStructuresAndAlgorithms.dataStructures.tree.BinaryTree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TreeIntersectionTest {
    @Test
    public void canReturnACommonValue() {
        BinaryTree testree1 = new BinaryTree();
        testree1.setRoot(1);

        BinaryTree testree2 = new BinaryTree();
        testree2.setRoot(1);

        TreeIntersection testersection = new TreeIntersection();

        List<Integer> testResults = testersection.treeIntersection(testree1, testree2);

        assertTrue(testResults.get(0) == 1);
    }


    @Test
    public void canReturnMultipleCommonValues() {
        BinaryTree testree1 = new BinaryTree();
        testree1.setRoot(1);
        testree1.getRoot().setLeftChild(2);
        testree1.getRoot().setRightChild(3);


        BinaryTree testree2 = new BinaryTree();
        testree2.setRoot(1);
        testree2.getRoot().setLeftChild(2);
        testree2.getRoot().setRightChild(3);

        TreeIntersection testersection = new TreeIntersection();

        List<Integer> testResults = testersection.treeIntersection(testree1, testree2);

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(3);

        assertArrayEquals(expected.toArray(), testResults.toArray());
    }

    @Test
    public void canReturnNullIfATreeIsEmpty() {
        BinaryTree testree1 = new BinaryTree();
        testree1.setRoot(1);
        testree1.getRoot().setLeftChild(2);
        testree1.getRoot().setRightChild(3);

        testree1.getRoot().getLeftChild().setLeftChild(4);
        testree1.getRoot().getLeftChild().setRightChild(5);

        testree1.getRoot().getRightChild().setLeftChild(6);
        testree1.getRoot().getRightChild().setRightChild(7);


        BinaryTree testree2 = new BinaryTree();

        TreeIntersection testersection = new TreeIntersection();

        assertNull(testersection.treeIntersection(testree1, testree2));
    }
}
