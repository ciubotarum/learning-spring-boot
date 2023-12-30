package com.loops;

public class MyNumber {
    private int number;
    public MyNumber(int number) {
        this.number = number;
    }
    public boolean isPrime() {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return  false;
            }
        }
        return true;
    }
    public int sumUptoN() {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
    public int sumOfDivisors() {
        int sum1 = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum1 += i;
            }
        }
        return sum1;
    }
    public String printANumberTriangle() {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();

        }
        return "";
    }

}
