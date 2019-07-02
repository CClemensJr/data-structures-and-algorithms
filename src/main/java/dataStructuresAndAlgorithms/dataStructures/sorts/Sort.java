package dataStructuresAndAlgorithms.dataStructures.sorts;

import static java.util.Arrays.copyOfRange;

public class Sort {

/**
 * This method takes an array and returns it, sorted, using the insertion sort technique.
 * @param arr
 * @return
 */
    public static int[] insertionSort(int[] arr) {
        try {
            for (int i = 1; i < arr.length; i++) {
                int j = i - 1;
                int temp = arr[i];

                while (j >= 0 && temp < arr[j]) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }

                arr[j + 1] = temp;
            }

            return arr;

        } catch (Exception e) {

            System.out.println("An error has occurred: " + e);
        }

        return null;
    }


    public static int[] mergeSort(int[] arr) {
        try {
            int n = arr.length;

            if (arr.length > 1) {
                int mid = n / 2;
                int[] b = copyOfRange(arr, 0, mid);
                int[] c = copyOfRange(arr, mid, n);

                mergeSort(b);
                mergeSort(c);

                merge(b, c, arr);
            }
        } catch (Exception e) {

            System.out.println("An error has occurred: " + e);
        }

        return null;
    }
}
