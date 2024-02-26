package week07_review;

import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {60, 70, 80, 90};
        int[] arr3 = new int[arr1.length + arr2.length];

        // Ensure that the third array has enough capacity to contains the elements of both arr1 and arr2

        int j = 0; // for keeping track of arr3 indexes

        for (int each : arr1) {
            arr3[j++] = each;
        }

        for (int each : arr2) {
            arr3[j++] = each;
        }

        System.out.println(Arrays.toString(arr3));

    }

}
/*
Give the two arrays: arr1, arr2.
Write a program that can combine the given arrays into the third array arr3
    arr1 = {1, 2, 3, 4}
    arr2 = {5, 6,7}

    output:
        {1, 2, 3, 4, 5, 6, 7}
 */


