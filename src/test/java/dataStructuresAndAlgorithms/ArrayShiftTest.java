package dataStructuresAndAlgorithms.challenges.arrayShift;

import dataStructuresAndAlgorithms.challenges.arrayShift.ArrayShift;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test
    public void testMethodReturnNotNull() {
        ArrayShift arrShift = new ArrayShift();
        int[] originalArray = { 1, 43, 17, 19 };
        int valueToBeInserted = 150;
        int[] shiftedArray = arrShift.insertShiftArray(originalArray, valueToBeInserted);

        assertNotNull(shiftedArray);
    }

    @Test
    public void insertShiftArrayShouldReturnArray() {
        ArrayShift test = new ArrayShift();
        int[] arr = { 1, 43, 17, 19 };
        int val = 150;

        int[] shiftedArr = test.insertShiftArray(arr, val);

        assertEquals(5, shiftedArr.length);
    }
}
