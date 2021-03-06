package dataStructuresAndAlgorithms;

import dataStructuresAndAlgorithms.challenges.queueWithStacks.PseudoQueue;
import dataStructuresAndAlgorithms.dataStructures.stacksAndQueues.Queue;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class PseudoQueueTest {
    @Test
    public void canSuccessfullyInstantiateAnEmptyQueue() {
        PseudoQueue testQueue = new PseudoQueue();

        assertNull(testQueue.getFront());
        assertTrue(testQueue.getSize() == 0);
    }

    @Test
    public void canSuccessfullyEnqueueIntoAQueue() {
        PseudoQueue testQueue = new PseudoQueue();

        testQueue.enqueue("7");

        assertTrue(testQueue.getFront().getValue() == "7");
        assertTrue(testQueue.getSize() == 1);
    }

    @Test
    public void canSuccessfullyEnqueueMultipleValuesIntoAQueue() {
        PseudoQueue testQueue = new PseudoQueue();

        testQueue.enqueue("7");
        testQueue.enqueue("77");
        testQueue.enqueue("777");
        testQueue.enqueue("7777");
        testQueue.enqueue("77777");
        testQueue.enqueue("777777");

        assertTrue(testQueue.getFront().getValue() == "7");
        assertTrue(testQueue.getSize() == 6);
    }

    @Test
    public void canSuccessfullyDequeueOutOfAQueueTheExpectedValue() {
        PseudoQueue testQueue = new PseudoQueue();

        testQueue.enqueue("7");
        testQueue.enqueue("77");
        testQueue.enqueue("777");
        testQueue.enqueue("7777");
        testQueue.enqueue("77777");
        testQueue.enqueue("777777");


        assertTrue(testQueue.dequeue() == "7");
        assertTrue(testQueue.getSize() == 5);
    }


    @Test
    public void canSuccessfullyEmptyAQueueAfterMultipleDequeues() {
        PseudoQueue testQueue = new PseudoQueue();

        testQueue.enqueue("7");
        testQueue.enqueue("77");
        testQueue.enqueue("777");
        testQueue.enqueue("7777");
        testQueue.enqueue("77777");
        testQueue.enqueue("777777");

        for (int i = 0; i < 6; i++) {
            testQueue.dequeue();
        }

        assertTrue(testQueue.getSize() == 0);
    }
}
