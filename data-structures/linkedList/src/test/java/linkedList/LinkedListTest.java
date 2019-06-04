package linkedList;

import org.junit.Test;
import sun.awt.image.ImageWatched;

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

    @Test
    public void canSuccessfullyAddMultipleNodesToTheTndOfALinkedList() {
        LinkedList test = new LinkedList();

        test.insert(57);
        test.append(98);
        test.append(103);
        test.append(10);
        test.append(33);

        assertTrue(test.getHead().getNext().getNext().getNext().getNext().getValue() == 33);
    }


/****************
 * Insert Before tests
 * */
    @Test
    public void canSuccessfullyInsertANodeBeforeANodeLocatedInTheMiddleOfALinkedList() {
        LinkedList test = new LinkedList();

        test.insert(0);
        test.append(1);
        test.append(3);

        test.insertBefore(3, 2);

        assertTrue(test.getHead().getNext().getNext().getValue() == 2);
    }

    @Test
    public void canSuccessfullyInsertANodeBeforeTheFirstNodeOfALinkedList() {
        LinkedList test = new LinkedList();

        test.insert(0);

        for (int i = 1; i <= 5; i++) {
            test.append(i);
        }

        test.insertBefore(0, 49);

        assertTrue(test.getHead().getValue() == 49);
    }


/****************
 * Insert After tests
 * */
    @Test
    public void canSuccessfullyInsertAfterANodeInTheMiddleOfTheLinkedList() {
        LinkedList test = new LinkedList();

        test.insert(0);
        test.append(1);
        test.append(3);

        test.insertAfter(1, 2);

        assertTrue(test.getHead().getNext().getNext().getValue() == 2);
    }

    @Test
    public void canSuccessfullyInsertANodeAfterTheLastNodeOfTheLinkedList() {
        LinkedList test = new LinkedList();

        test.insert(0);

        for (int i = 1; i <= 5; i++) {
            test.append(i);
        }

        test.insertAfter(5, 6);

        assertTrue(test.getFoot().getValue() == 6);
    }
}
