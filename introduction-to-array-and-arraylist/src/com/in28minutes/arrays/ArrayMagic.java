package com.in28minutes.arrays;

import java.util.ArrayList;

public class ArrayMagic {

    public static void main(String[] args) {
//        int[] arr = {1, 1, 1, 1};
//        int[] arr = {5, 7, 7, 9, 2, 4, 9};
        int[] arr = {5, 5, 5, 4, 4};
        int secondLargest = findSecondLargestElement(arr);
        System.out.println(secondLargest);
    }

    public static int findSecondLargestElement(int[] array) {
        // create vector for unique elements
        ArrayList<Integer> unique = new ArrayList<>();

        // go through all elements of the array
        for (int value : array) {
            boolean existsInUnique = false;
            // go through all the elements of unique array
            for (int element : unique) {
                //  check if value is equal with the unique array value
                if (value == element) {
                    existsInUnique = true;
                    break;
                }
            }

            // if the element does not exist in unique array then add value into unique
            if (existsInUnique == false) {
                unique.add(value);
            }
        }

        // print uniwue value
        System.out.println(unique);

        // if there is less than 2 unique elements than return -1
        if (unique.size() < 2) {
            return -1;
        }

        //
        int max = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;
        for (int value : unique) {

            // if the value is greater than max then set the max with that value
            if (value > max) {
                secondLargestElement = max;
                max = value;
            } // else if value > second largest then set the second largest with the current value
            else if (value > secondLargestElement) {
                secondLargestElement = value;
            }
        }

        //

        return secondLargestElement;

    }
}
