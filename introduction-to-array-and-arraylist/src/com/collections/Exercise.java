package com.collections;

public class Exercise {

    public static void main(String[] args) {
        MyString myString = new MyString("1A 2B 3C");
        boolean hexadecimal = myString.isHexadecimal();
        System.out.println(hexadecimal);

    }
    public static class MyString {

        public String str;

        public MyString(String str) {
            this.str = str;
        }

        public boolean isHexadecimalChar(char ch) {
            // Write your code here
            char chToLowercase = Character.toLowerCase(ch);

            if (chToLowercase == 'a' || chToLowercase == 'b' || chToLowercase == 'c' ||
                    chToLowercase == 'd' || chToLowercase == 'e' || chToLowercase == 'f') {
                return true;
            }
            return false;
        }

        public boolean isHexadecimal() {
            // Write your code here
            if (str == null) {
                return false;
            }
            String strToLowercase = str.toLowerCase();
            char[] strToChar = strToLowercase.toCharArray();
            // for (char character : strToChar) {
            //     if (character == ' ' || char) {
            //         return false;
            //     }else
            //     if (Character.isDigit(character) || isHexadecimalChar(character) ) {
            //         return true;
            //     }
            // }
            for (char character : strToChar) {
//                if (isHexadecimalChar(character) && character >= 97 && character <= 102) {
                boolean isNotDigit = !Character.isDigit(character);
                boolean isNotHexChar = !isHexadecimalChar(character);
                if (isNotDigit && isNotHexChar)  {
                    return false;
                }
            }

            return true;
        }


    }
}
