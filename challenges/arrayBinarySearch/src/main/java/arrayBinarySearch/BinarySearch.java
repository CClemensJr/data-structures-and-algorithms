package arrayBinarySearch;

public class BinarySearch {
    public int binarySearch(int[] arr, int val) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        if (val == arr[mid]) {
            return mid;
        }

        while (start <= end) {
            mid = (start + end) / 2;

            if (val == arr[mid]) return mid;

            if (val > arr[mid]) start = mid + 1;

            if (val < arr[mid]) end = mid - 1;
        }

        return -1;
    }
}
