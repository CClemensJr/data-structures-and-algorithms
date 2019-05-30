package arrayBinarySearch;

public class BinarySearch {
    public int binarySearch(int[] arr, int val) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        if (val == arr[mid]) {
            return mid;
        }

        while (val != arr[mid]) {
            if (val > arr[mid]) {
                start = mid;
                mid = (start + end) / 2;

                continue;
            }

            if (val < arr[mid]) {
                end = mid;
                mid = (start + end) / 2;

                continue;
            }
        }

        return mid;
    }
}
