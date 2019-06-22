package dataStructuresAndAlgorithms;

import dataStructuresAndAlgorithms.dataStructures.tree.BinaryTree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static dataStructuresAndAlgorithms.challenges.fizzBuzzTree.FizzBuzzTree.fizzBuzzTree;
import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    @Test
    public void canUpdateNodeValueToFizz() {
        BinaryTree test1 = new BinaryTree(3);
        BinaryTree test2 = new BinaryTree(5);
        BinaryTree test3 = new BinaryTree(15);

        test1.getRoot().setLeftChild(test2.getRoot());
        test1.getRoot().setRightChild(test3.getRoot());

        fizzBuzzTree(test1);

        List expected = new ArrayList();
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add("FizzBuzz");

        assertEquals(expected, test1.preOrder());
    }
}
