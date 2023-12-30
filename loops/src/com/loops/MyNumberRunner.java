package com.loops;

public class MyNumberRunner {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(9);
        System.out.println("The number is prime: " + number.isPrime());

        int sum = number.sumUptoN();
        System.out.println("The sum up to n: " + sum);

        int sumOfDivisors = number.sumOfDivisors();
        System.out.println("Sum of divisors: " + sumOfDivisors);

        number.printANumberTriangle();


    }
}

