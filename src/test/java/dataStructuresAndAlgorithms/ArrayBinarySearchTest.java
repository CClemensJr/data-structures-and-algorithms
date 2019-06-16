package dataStructuresAndAlgorithms.challenges.arrayBinarySearch;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayBinarySearchTest {
    @Test
    public void binarySearchShouldReturnTheCorrectIndex() {
        BinarySearch test = new BinarySearch();

        int[] arr = { 1, 25, 37, 75, 125, 148 };
        int val = 125;
        int expectedIndex = 4;

        assertTrue(test.binarySearch(arr, val) == expectedIndex);
    }

    @Test
    public void binarySearchShouldVerifyIfValueNotInArray() {
        BinarySearch test = new BinarySearch();

        int[] arr = { 1, 25, 37, 75, 125, 148 };
        int val = 136;
        int expectedIndex = -1;

        assertTrue(test.binarySearch(arr, val) == expectedIndex);
    }
}
