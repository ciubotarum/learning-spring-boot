package com.functional.programming;

import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
        List<String> list2 = List.of("Apple", "Bat", "Cat", "Dog");

//        printBasic(list);
//        printWithFP(list);
//        printBasicWithFiltering(list2);
        printWithFPWithFiltering(list2);
    }

    private static void printBasic(List<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    private static void printWithFP(List<String> list) {
        list.stream().forEach(
                element -> System.out.println(element)
        );
    }
    private static void printBasicWithFiltering(List<String> list) {
        for (String string : list) {
            if (string.endsWith("at")) {
                System.out.println(string);
            }
        }
    }
    private static void printWithFPWithFiltering(List<String> list) {
        list.stream()
                .filter(
                        element -> element.endsWith("at")
                )
                .forEach(
                element -> System.out.println(element)
        );
    }
}