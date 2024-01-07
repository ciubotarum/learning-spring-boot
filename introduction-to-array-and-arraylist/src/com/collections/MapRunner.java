package com.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        String str = "This is an awesome occasion. "
                + "This has never happened before.";

        Map<Character, Integer> occurances = new HashMap<>();

//        occurances.put("T", 1);
//        occurances.put("h", 1);
//        occurances.put("i", 2);
        char[] characters = str.toCharArray();

        for (char character : characters) {
            // Get the character
            Integer integer = occurances.get(character);
            // if it is there, we increment the count
            if (integer == null) {
                occurances.put(character, 1);
            } else {
                occurances.put(character, integer + 1);
            }
            // if it is not there, initialize to 1
        }
        System.out.println(occurances);

        Map<String, Integer> stringOccurances = new HashMap<>();
        String[] words = str.split(" ");

        for (String word : words) {
            // Get the character
            Integer integer = stringOccurances.get(word);
            // if it is there, we increment the count
            if (integer == null) {
                stringOccurances.put(word, 1);
            } else {
                stringOccurances.put(word, integer + 1);
            }
            // if it is not there, initialize to 1
        }
        System.out.println(stringOccurances);

    }
}
