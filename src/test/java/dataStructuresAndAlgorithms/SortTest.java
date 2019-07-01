package dataStructuresAndAlgorithms;


import org.junit.Test;
import static dataStructuresAndAlgorithms.dataStructures.sorts.Sort.insertionSort;
import static org.junit.Assert.*;

public class SortTest {
    @Test
    public void canUseInsertionSort() {
        int[] test = { 12, 11, 13, 5, 6 };
        int[] expected = { 5, 6, 11, 12, 13 };
        int[] actual = insertionSort(test);

        assertArrayEquals(expected, actual);
    }
}
