package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> listOfMarks = new ArrayList<Integer>();
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
        return Collections.max(listOfMarks);
    }
    public int getMinimumMark() {
        return Collections.min(listOfMarks);
    }
    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int numbers = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(numbers),3, RoundingMode.UP);
    }
    public  String toString(){
        return name + listOfMarks;
    }
    public void addNewMark(int mark) {
        listOfMarks.add(mark);
    }
    public void removeMarkAtIndex(int index){
        listOfMarks.remove(index);
    }

}
