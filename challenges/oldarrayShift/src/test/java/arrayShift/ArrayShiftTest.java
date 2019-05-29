package arrayShift;

import org.junit.Test;

public class ArrayShiftTest {
    @Test
    public void testMethodReturnNotNull {
        ArrayShift arrShift = new ArrayShift();
        int[] originalArray = { 1, 43, 17, 19 }
        int valueToBeInserted = 150;

        int[] shiftedArray = originalArray.insertShiftArray(originalArray, valueToBeInserted);

        assertNotNull(shiftedArray);
    }


    @Test
    public void testMethodReturnsArray {
        ArrayShift arrShift = new ArrayShift();
        int[] originalArray = { 1, 43, 17, 19 }
        int valueToBeInserted = 150;

        int[] shiftedArray = originalArray.insertShiftArray(originalArray, valueToBeInserted);

        assertTrue(shiftedArray instanceof Array);
    }


    @Test
    public void testMethodReturnsLargerArray {
        ArrayShift arrShift = new ArrayShift();
        int[] originalArray = { 1, 43, 17, 19 }
        int valueToBeInserted = 150;

        int[] shiftedArray = originalArray.insertShiftArray(originalArray, valueToBeInserted);

        assertTrue(shiftedArray.length == 5);
    }


    @Test
    public void testMethodReturnsShiftedArray {
        ArrayShift arrShift = new ArrayShift();
        int[] originalArray = { 1, 43, 17, 19 }
        int valueToBeInserted = 150;
        int[] expectedArray = { 1, 43, 150, 17, 19 }

        int[] shiftedArray = originalArray.insertShiftArray(originalArray, valueToBeInserted);

        assertEquals(expectedArray, shiftedArray);
    }
}
