package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student("Marius", new int[]{97, 98, 100});
        Student student1 = new Student("Dan", new int[]{98, 100});
        Student student2 = new Student("Eve", new int[]{97, 98, 100,90});

        int number = student.getNumberOfMarks();
        System.out.println("Number of marks: " + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("Sum of the grades: " + sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("The greatest mark: " + maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("The smallest mark: " + minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("Average: " + average);



    }
}