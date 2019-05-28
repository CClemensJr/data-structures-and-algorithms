public class ArrayShift {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3 };
        insertShiftArray(arr, 0);
    }


    /***********
     *  Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.
     * */
    public static int[] insertShiftArray(int[] array, int value) {
        int length = array.length + 1;
        int[] shiftedArray = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Inside insertShiftArray");
        }

        return shiftedArray;
    }
}