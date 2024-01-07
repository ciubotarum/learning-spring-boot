package com.object_oriented_programming_2.interfaces;

public class RealAlgorithm implements ComplexAlgorithm{
    @Override
    public int complexAlgorithm(int number1, int number2) {
        return number1 * number2;
    }
}
