package stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void canSuccessfullyInstantiateAnEmptyQueue() {
        Queue testQueue = new Queue();

        assertTrue(testQueue.getSize() == 0);
    }

    @Test
    public void canSuccessfullyEnqueueIntoAQueue() {
        Queue testQueue = new Queue();

        testQueue.enqueue("7");


        assertTrue(testQueue.getFront().getValue() == "7");
        assertTrue(testQueue.getSize() == 1);
    }

    @Test
    public void canSuccessfullyEnqueueMultipleValuesIntoAQueue() {
        Queue testQueue = new Queue();

        testQueue.enqueue("7");
        testQueue.enqueue("77");
        testQueue.enqueue("777");
        testQueue.enqueue("7777");
        testQueue.enqueue("77777");
        testQueue.enqueue("777777");

        assertTrue(testQueue.getFront().getValue() == "7");
        assertTrue(testQueue.getSize() == 6);
    }
    // Can successfully dequeue out of a queue the expected value
    // Can successfully peek into a queue, seeing the expected value
    // Can successfully empty a queue after multiple dequeues

}
