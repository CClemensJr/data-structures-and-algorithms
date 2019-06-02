package linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void canSuccessfullyInstantiateAnEmptyLinkedList() {
        LinkedList test = new LinkedList();

        assertTrue(test.getSize() == 0);
    }

    @Test
    public void canProperlyInsertIntoTheLinkedList() {
        LinkedList test = new LinkedList();

        test.insert(7);

        //assertTrue(test.getHead().getValue() == 7);
        assertTrue(test.getSize() == 1);
    }

    @Test
    public void theHeadPropertyShouldPointToTheFirstNode() {
        LinkedList test = new LinkedList();

        test.insert(7);

        Node head = test.getHead();

        assertTrue(head.getValue() == 7);
    }

    @Test
    public void canProperlyInsertMultipleNodesIntoTheLinkedList() {
        LinkedList test = new LinkedList();

        test.insert(7);
        test.insert(8);
        test.insert(9);

        // assertTrue(test.getSize() == 3);
        assertTrue(test.getHead().getNext().getValue() == 8);
    }


    @Test
    public void willReturnTrueWhenFindingAValueWithinTheLinkedListThatExists() {
        LinkedList test = new LinkedList();

        for (int i = 1; i < 10; i++) {
            test.insert(i);
        }

        boolean isInList = test.includes(7);

        assertTrue(isInList);
    }


    @Test
    public void willReturnFalseWhenSearchingForAValueInTheLinkedListThatDoesNotExist() {
        LinkedList test = new LinkedList();

        for (int i = 1; i < 10; i++) {
            test.insert(i);
        }

        boolean isInList = test.includes(25);

        assertFalse(isInList);
    }

    // Can properly return a collection of all the values that exist in the linked list
}
