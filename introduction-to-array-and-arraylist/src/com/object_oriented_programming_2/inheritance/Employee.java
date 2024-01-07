package com.object_oriented_programming_2.inheritance;

import java.math.BigDecimal;

public class Employee extends Person{
    private String title;
    private String employerName;
    private char employeeGrade;
    private BigDecimal salary;

    public Employee(String name, String title) {
        super(name);
        this.title = title;
        System.out.println("Employee Constructor");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employerName;
    }

    public void setEmployer(String employerName) {
        this.employerName = employerName;
    }

    public int getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String toString(){
        return super.toString() + "#" + title + "#" + employerName + "#" + employeeGrade;
    }

}
