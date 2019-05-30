package arrayBinarySearch;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void binarySearchShouldReturnTheCorrectIndex() {
        BinarySearch test = new BinarySearch();

        int[] arr = { 1, 25, 37, 75, 125, 148 };
        int val = 37;
        int expectedIndex = 2;

        assertTrue(test.binarySearch(arr, val) == expectedIndex);
    }
}
