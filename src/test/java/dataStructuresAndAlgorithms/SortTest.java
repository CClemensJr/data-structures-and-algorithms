package dataStructuresAndAlgorithms;


import org.junit.Test;

import java.util.ArrayList;

import static dataStructuresAndAlgorithms.dataStructures.sorts.Sort.*;
import static org.junit.Assert.*;

public class SortTest {
    @Test
    public void canUseInsertionSort() {
        int[] test = { 12, 11, 13, 5, 6 };
        int[] expected = { 5, 6, 11, 12, 13 };
        int[] actual = insertionSort(test);

        assertArrayEquals(expected, actual);
    }


//    @Test
//    public void canUseMergeSort() {
//        int[] test = { 12, 11, 13, 5, 6 };
//        int[] expected = { 5, 6, 11, 12, 13 };
//
//        mergeSort(test);
//
//        assertArrayEquals(expected, test);
//    }


    @Test
    public void canUseQuickSort() {
        int[] test = { 12, 11, 13, 5, 6 };
        int[] expected = { 5, 6, 11, 12, 13 };

        quickSort(test, 12, 6);

        assertArrayEquals(expected, test);
    }
}
