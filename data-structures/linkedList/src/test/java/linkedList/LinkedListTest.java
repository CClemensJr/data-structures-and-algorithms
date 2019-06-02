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

        assertTrue(test.getSize() == 3);
    }


    // Will return true when finding a value within the linked list that exists

    // Will return false when searching for a value in the linked list that does not exist

    // Can properly return a collection of all the values that exist in the linked list
}
