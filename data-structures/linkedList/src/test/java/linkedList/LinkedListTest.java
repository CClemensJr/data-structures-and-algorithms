package linkedList;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {
/****************
 * General tests
 * */
    @Test
    public void canSuccessfullyInstantiateAnEmptyLinkedList() {
        LinkedList test = new LinkedList();

        assertTrue(test.getSize() == 0);
    }


/****************
 * Insert tests
 * */
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


/****************
 * Includes tests
 * */
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


/****************
 * Print tests
 * */
    @Test
    public void canProperlyReturnACollectionOfAllTheValuesThatExistInTheLinkedList() {
        LinkedList test = new LinkedList();

        for (int i = 0; i < 10; i++) {
            test.insert(i);
        }

        int[] expected = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] actual = test.print();

        assertArrayEquals(expected, actual);
    }


/****************
 * Append tests
 * */
    @Test
    public void canSuccessfullyAddANodeToTheEndOfTheLinkedList() {
        LinkedList test = new LinkedList();

        test.insert(57);
        test.append(98);

        assertTrue(test.getHead().getNext().getValue() == 98);
    }
    // Can successfully add multiple nodes to the end of a linked list


/****************
 * Insert Before tests
 * */
    // Can successfully insert a node before a node located i the middle of a linked list
    // Can successfully insert a node before the first node of a linked list

/****************
 * Insert After tests
 * */
    // Can successfully insert after a node in the middle of the linked list
    // Can successfully insert a node after the last node of the linked list
}
