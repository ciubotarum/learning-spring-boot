package com.object_oriented_programming_2.inheritance;

public class StudentRunner {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("jvghj");
//        student.setEmail("hfbcdbv");

//        Person person = new Person();
//        person.setName("Mihaela");
//        person.setEmail("mihaela@gmail.com");
//        person.setPhoneNumber("0472685432");
//        String value = person.toString();
//        System.out.println(value);
//        System.out.println(person);

        Employee employee = new Employee("hfghh", "jgft");
        employee.setName("Mihaela");
        employee.setEmail("mihaela@gmail.com");
        employee.setPhoneNumber("0472685432");
        employee.setEmployeeGrade('A');
        employee.setTitle("Programmer Analyst");

        System.out.println(employee);


    }

}
