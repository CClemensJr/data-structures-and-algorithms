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

        assertTrue(test.getHead().getValue() == 7);
    }

    // The head property will properly point to the first node in the linked list

    // Can properly insert multiple nodes into the linked list

    // Will return true when finding a value within the linked list that exists

    // Will return false when searching for a value in the linked list that does not exist

    // Can properly return a collection of all the values that exist in the linked list
}
