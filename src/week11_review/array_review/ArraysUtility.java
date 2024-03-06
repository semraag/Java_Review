package week11_review.array_review;

/**
 * This class provides utility methods for working with arrays.
 */
public class ArraysUtility {

    /**
     * Reverses the order of the elements in an array.
     *
     * @param arr the array to reverse
     * @return a new array containing the elements of the input array in reverse order
     */
    public static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - i - 1];
        }
        return reversedArray;
    }

    /**
     * Reverses the order of the elements in an array.
     *
     * @param arr the array to reverse
     * @return a new array containing the elements of the input array in reverse order
     */
    public static double[] reverseArray(double[] arr) {
        double[] reversedArray = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - i - 1];
        }
        return reversedArray;
    }

    /**
     * Reverses the order of the elements in an array.
     *
     * @param arr the array to reverse
     * @return a new array containing the elements of the input array in reverse order
     */
    public static char[] reverseArray(char[] arr) {
        char[] reversedArray = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - i - 1];
        }
        return reversedArray;
    }

    /**
     * Reverses the order of the elements in an array.
     *
     * @param arr the array to reverse
     * @return a new array containing the elements of the input array in reverse order
     */
    public static String[] reverseArray(String[] arr) {
        String[] reversedArray = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - i - 1];
        }
        return reversedArray;
    }

    /**
     * Combines two arrays into a single array.
     *
     * @param arr1 the first array
     * @param arr2 the second array
     * @return a new array containing the elements of both input arrays
     */
    public static int[] combineArrays(int[] arr1, int[] arr2) {
        int[] combinedArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            combinedArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combinedArray[arr1.length + i] = arr2[i];
        }
        return combinedArray;
    }

    /**
     * Combines two arrays into a single array.
     *
     * @param arr1 the first array
     * @param arr2 the second array
     * @return a new array containing the elements of both input arrays
     */
    public static double[] combineArrays(double[] arr1, double[] arr2) {
        double[] combinedArray = new double[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            combinedArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combinedArray[arr1.length + i] = arr2[i];
        }
        return combinedArray;
    }

    /**
     * Combines two arrays into a single array.
     *
     * @param arr1 the first array
     * @param arr2 the second array
     * @return a new array containing the elements of both input arrays
     */
    public static char[] combineArrays(char[] arr1, char[] arr2) {
        char[] combinedArray = new char[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            combinedArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combinedArray[arr1.length + i] = arr2[i];
        }
        return combinedArray;
    }

    /**
     * Combines two arrays into a single array.
     *
     * @param arr1 the first array
     * @param arr2 the second array
     * @return a new array containing the elements of both input arrays
     */
    public static String[] combineArrays(String[] arr1, String[] arr2) {
        String[] combinedArray = new String[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            combinedArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            combinedArray[arr1.length + i] = arr2[i];
        }
        return combinedArray;
    }

}
