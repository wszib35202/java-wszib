/*
Exercise 3:
Given an array of ints, print to console true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
Example:
int[] array = {3,2,14,1,2,3,6};

should print true
*/

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[] array0 = {3,2,14,1,2,3,6};
        int[] array1 = {2,3,2,14,1,4,3,6};
        int[] array2 = {3,2,1,2,4};
        int[] array3 = {1,2,3,5,6,7,8};
        int[] array4 = {123, 12, 1, 23, 123};
        int[] array5 = {3,2,14,1,4,3,6,3,2,14,1,4,3,6,5,6,7,8,2,1,2,3};

        checkSequence(array0);
        checkSequence(array1);
        checkSequence(array2);
        checkSequence(array3);
        checkSequence(array4);
        checkSequence(array5);
    }

    public static void checkSequence(int[] arr) {
        boolean isSequenceExists = false;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 3 && arr[i-1] == 2 && arr[i-2] == 1) isSequenceExists = true;
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }

        System.out.print(" : " + isSequenceExists + "\n");
    }
}