package dataStructuresAndAlgorithms.dataStructures.sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.copyOfRange;

public class Sort {

/**************
 * Insertion Sort
 * */

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



/**************
 * Merge Sort and Friends
 * */
    /**
     * This method takes in an array and returns it, sorted, using the merge sort technique
     * @param arr
     * @return
     */
    public static void mergeSort(int[] arr) {
        try {
            int n = arr.length;

            if (arr.length > 1) {
                int mid = n / 2;
                int[] b = copyOfRange(arr, 0, mid);
                int[] c = copyOfRange(arr, mid + 1, n);

                mergeSort(b);
                mergeSort(c);

                merge(b, c, arr);
            }
        } catch (Exception e) {

            System.out.println("An error has occurred: " + e);
        }

    }


    public static ArrayList<int[]> merge(int[] b, int[] c, int[] a) {
        try {
            int i = 0;
            int j = 0;
            int k = 0;

            while (i < b.length && j < c.length) {
                if (b[i] <= c[j]) {
                    a[k] = b[i];

                    i++;
                } else {
                    a[k] = c[j];

                    j++;
                }
            }

            ArrayList<int[]> aList = new ArrayList<>();

            if (i == b.length) {
                aList.addAll(Arrays.asList(a));
                aList.addAll(Arrays.asList(c));
            } else {
                aList.addAll(Arrays.asList(a));
                aList.addAll(Arrays.asList(c));
            }

            return aList;
        } catch (Exception e) {

            System.out.println("An error has occurred: " + e);
        }

        return null;
    }



/**************
 * Quick Sort and Friends
 * */
    public static void quickSort(int[] arr, int left, int right) {
        try {
            int position = partition(arr, left, right);

            quickSort(arr, left, position - 1);
            quickSort(arr, position + 1, right);

        } catch (Exception e) {

            System.out.println("An error has occurred: " + e);
        }
    }


    public static int partition(int[] arr, int left, int right) {
        try {
            int pivot = arr[right];
            int low = left - 1;

            for(int i = left; i <= right; i++) {
                if (arr[i] <= pivot) {
                    low++;
                    swap(arr, i, low);
                }
            }

            swap(arr, right, low + 1);

            return low + 1;
        } catch (Exception e) {

            System.out.println("An error has occurred: " + e);
        }

        return 0;
    }


    public static void swap(int[] arr, int i, int low) {
        int temp;

        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }

}
