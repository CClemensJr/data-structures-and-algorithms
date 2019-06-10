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

        //assertTrue(testQueue.getRear().toString() == "7");
        assertTrue(testQueue.getSize() == 1);
    }
    // Can successfully enqueue multiple values into a queue
    // Can successfully dequeue out of a queue the expected value
    // Can successfully peek into a queue, seeing the expected value
    // Can successfully empty a queue after multiple dequeues

}
