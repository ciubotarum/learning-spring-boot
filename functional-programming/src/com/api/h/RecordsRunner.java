package com.api.h;

public class RecordsRunner {
    record Person(String name, String email, String phoneNumber) {
//        Person(String name, String email, String phoneNumber) {
//            if (name == null) {
//                throw new IllegalArgumentException("name is null");
//            }
//            this.name = name;
//            this.email = email;
//            this.phoneNumber = phoneNumber;
//        }
//        a compact constructor look like this
        Person {
            if (name == null) {
                throw new IllegalArgumentException("name is null");
            }
        }
        public String name() {
            System.out.println("Do Something");
            return name;
        }
    }
    public static void main(String[] args) {
        Person person = new Person("Mihaela", "mihaela@gmail.com", "123-456-7890");
        Person person1 = new Person("Mihaela", "mihaela@gmail.com", "123-456-7890");
        Person person2 = new Person("Mihaela1", "mihaela@gmail.com", "123-456-7890");

//        System.out.println(person);
//        System.out.println(person.equals(person1));
//        System.out.println(person.equals(person2));
        System.out.println(person.name());
    }
}
