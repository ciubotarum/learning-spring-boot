package com.in28minutes.oops;

public class MyChar {
    private char ch;
    public MyChar(char ch) {
        this.ch = ch;
    }
    public boolean isVowel() {
//        a e i o u or A E I O U
        if (Character.toUpperCase(ch) == 'A' ||
                Character.toUpperCase(ch) == 'E' ||
                Character.toUpperCase(ch) == 'I' ||
                Character.toUpperCase(ch) == 'O' ||
                Character.toUpperCase(ch) == 'U') {
            return true;
        }
        return false;
    }
    public boolean isDigit() {
        if (ch >= 48 && ch <= 57) {
            return true;
        }
        return false;
    }
    public boolean isAlphabet() {
        if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            return true;
        }
        return false;
    }
    public static void printLowerCaseAlphabets() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
    }
    public static void printUpperCaseAlphabets() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
    }
    public boolean isConsonant() {
        if (isAlphabet() && !isVowel()) {
            return true;
        }
        return false;
    }


}
