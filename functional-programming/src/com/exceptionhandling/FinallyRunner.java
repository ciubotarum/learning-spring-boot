package com.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            int[] numbers = {12, 3, 4, 5};

            int number = numbers[5];

        } catch (Exception e) {
            e.printStackTrace();
        } finally {   // run the code even if there is an exception
            System.out.println("Before Scanner Close");
            if (scanner != null) {
                scanner.close();
            }

        }

        System.out.println("Just before closing out main");
    }
}
