package com.collections;

public class StringMagic {
    public static void main(String[] args) {
        StringMagic stringMagic = new StringMagic();
        String hello = stringMagic.reverseWordsInSentence("Hello World");
        System.out.println(hello);
    }
    public String reverseWordsInSentence(String sentence) {
        // TODO: Check if the sentence is null.
        // If the sentence is null, return "INVALID"

        // TODO: Check if the sentence is empty.
        // If the sentence is empty, return an empty string

        // TODO: Split the sentence into words using the split method.
        // Use " " as the delimiter to match space.

        // TODO: Create a StringBuilder to hold the reversed sentence.

        // TODO: Loop through each word in the words array.

        // TODO: For each word, create a StringBuilder and reverse the word.
        // Append the reversed word, followed by a space, to the reversed sentence.

        // TODO: After reversing all the words, trim the trailing space and return the reversed sentence.
        if (sentence == null) {
            return "INVALID";
        }
        if (sentence.isEmpty()) {
            return "";
        }

        String[] splitString = sentence.split(" ");
        StringBuilder  newSentence = new StringBuilder();
        for (String word : splitString) {
            StringBuilder str = new StringBuilder(word);
            String reversed = str.reverse() + " ";
            newSentence.append(reversed);
        }

        return newSentence.toString();
    }
}
