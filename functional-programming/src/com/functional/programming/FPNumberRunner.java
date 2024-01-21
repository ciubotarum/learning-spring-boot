package com.functional.programming;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
//        numbers.stream().
//                forEach(element -> System.out.println(element));
//        int sum = numbers.stream().reduce(
//                0,
//                (number1, number2) -> number1 + number2);
//        int sum = normalSum(numbers);
//        int sum = fpSum(numbers);
//        System.out.println(sum);
        IntStream.range(1,11).forEach(e -> System.out.println(e*e)); // square of first 10 numbers

        List.of("Apple", "Ant", "Bat").stream().map(e -> e.toLowerCase())
                .forEach(e ->System.out.println(e)); // print to lowercase list
        List.of("Apple", "Ant", "Bat").stream().map(e -> e.length())
                .forEach(e -> System.out.println(e)); // print the length of each element from the list
    }

    private static int fpSum(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (number1, number2) -> {
                    System.out.println(number1 + " " + number2);
                    return number1 + number2;
                });
    }

    private static int normalSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number; // mutations
        }
        return sum;
    }
}
