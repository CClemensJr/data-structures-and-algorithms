package dataStructuresAndAlgorithms;

import dataStructuresAndAlgorithms.dataStructures.tree.BinaryTree;
import org.junit.Test;

import static dataStructuresAndAlgorithms.challenges.fizzBuzzTree.FizzBuzzTree.fizzBuzzTree;
import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    @Test
    public void canUpdateNodeValueToFizz() {
        BinaryTree testTree = new BinaryTree(3);

        BinaryTree actual = fizzBuzzTree(testTree);
        BinaryTree expected = new BinaryTree("Fizz");

        assertEquals(expected.getRoot(), actual.getRoot());
    }
}
