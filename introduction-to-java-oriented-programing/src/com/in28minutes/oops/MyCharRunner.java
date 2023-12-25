package com.in28minutes.oops;

public class MyCharRunner {

    public static void main(String[] args) {
        MyChar myChar = new MyChar('a');
        System.out.println(myChar.isVowel());
//        'a', 'e', 'i', 'u' and Capitals
//        myChar.isConsonant();
        System.out.println(myChar.isDigit());
        System.out.println(myChar.isAlphabet());
        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();
        System.out.println(myChar.isConsonant());

    }
}
