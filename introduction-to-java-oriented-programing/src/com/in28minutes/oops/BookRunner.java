package com.in28minutes.oops;

public class BookRunner {
    public static void main(String[] args) {
        Book artOfProgramming = new Book(100);
        Book effectiveJava = new Book(50);
        Book cleanCode = new Book(40);

        System.out.println(artOfProgramming.getNoOfCopies());

        artOfProgramming.setNoOfCopies(100);
        effectiveJava.setNoOfCopies(50);
        cleanCode.setNoOfCopies(45);

        artOfProgramming.increaseNoOfCopies(100);
        artOfProgramming.decreaseNoOfCopies(500);

        System.out.println(artOfProgramming.getNoOfCopies());


    }
}
