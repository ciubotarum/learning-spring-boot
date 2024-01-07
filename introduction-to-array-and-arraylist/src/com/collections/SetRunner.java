package com.collections;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
//        unique - Set
//        Tree - unique values in a sorted order
//        Hash - unique value no matter in witch order
//        LinkedHash - unique value in the order of insertion
        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println("treeSet " + treeSet);

        Set<Character> likedHashSet = new LinkedHashSet<>(characters);
        System.out.println("likedHashSet  " + likedHashSet );

        Set<Character> hashSet = new HashSet<>(characters);
        System.out.println("hashSet  " + hashSet );
    }
}
