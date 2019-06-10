package stacksandqueues;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void canSuccessfullyInstantiateAnEmptyStack() {
        Stack testStack = new Stack();

        assertTrue(testStack.getSize() == 0);
    }

    @Test
    public void canSuccessfullyPushOntoAStack() {
        Stack testStack = new Stack();

        testStack.push("7");

        assertTrue(testStack.getSize() == 1);
    }

    @Test
    public void canSuccessfullyPushMultipleValuesOntoAStack() {
        Stack testStack = new Stack();

        testStack.push("7");
        testStack.push("77");
        testStack.push("777");
        testStack.push("7777");
        testStack.push("77777");
        testStack.push("777777");

        assertTrue(testStack.getSize() == 6);
    }

    @Test
    public void canSuccessfullyPopOffTheStack() {
        Stack testStack = new Stack();

        testStack.push("7");
        testStack.push("77");
        testStack.push("777");
        testStack.push("7777");
        testStack.push("77777");
        testStack.push("777777");

        Object topValue = testStack.pop();

        assertTrue(topValue == "777777");
        assertTrue(testStack.getSize() == 5);
    }

    @Test
    public void canSuccessfullyEmptyAStackAfterMultiplePops() {
        Stack testStack = new Stack();

        testStack.push("7");
        testStack.push("77");
        testStack.push("777");
        testStack.push("7777");
        testStack.push("77777");
        testStack.push("777777");

        for (int i = 0; i < 6; i++) {
            testStack.pop();
        }

        assertTrue(testStack.getSize() == 0);
    }

    @Test
    public void canSuccessfullyPeekTheNextItemOnTheStack() {
        Stack testStack = new Stack();

        testStack.push("7");
        testStack.push("77");
        testStack.push("777");
        testStack.push("7777");
        testStack.push("77777");
        testStack.push("777777");

        assertTrue(testStack.peek() == "777777");
    }

}
