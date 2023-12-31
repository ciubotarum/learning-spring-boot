package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
    public Student(String name, int... listOfMarks) {
        this.name = name;
        for (int mark : listOfMarks) {
            this.listOfMarks.add(mark);
        }

    }
    public int getNumberOfMarks() {
        return listOfMarks.size();
    }
    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int marks:listOfMarks) {
            sum += marks;
        }
        return sum;
    }
    public int getMaximumMark() {
        int maximum = Integer.MIN_VALUE;
        for (int mark : listOfMarks) {
            if (mark > maximum) {
                maximum = mark;
            }
        }
        return maximum;
    }
    public int getMinimumMark() {
        int minimum = Integer.MAX_VALUE;
        for (int mark : listOfMarks) {
            if (mark < minimum) {
                minimum = mark;
            }
        }
        return minimum;
    }
    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int numbers = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(numbers),3, RoundingMode.UP);
    }

}
