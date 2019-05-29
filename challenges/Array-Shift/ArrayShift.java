public class ArrayShift {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3 };

        insertShiftArray(arr, 47);
        //System.out.println(insertShiftArray(arr, 47).toString);
    }


    /***********
     *  Without utilizing any of the built-in methods available to your language, return an array with the new value added at the middle index.
     * */
    public static int[] insertShiftArray(int[] array, int value) {
        int length = array.length + 1;
        int midPoint = length / 2;
        int[] shiftedArray = new int[length];


        for (int i = 0; i < length; i++) {
            if (i < midPoint) { shiftedArray[i] = array[i]; }
            if (i > midPoint) { shiftedArray[i] = array[i - 1]; }
            if (i == midPoint) { shiftedArray[i] = value; }

            System.out.println(shiftedArray[i]);
        }

        return shiftedArray;
    }
}