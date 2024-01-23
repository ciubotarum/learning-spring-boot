package com.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Ranga");
        names.add("Ravi");
        names.add("John");

//        List.of("hgv", "hfcjhc"); unmodifiable list
        List<String> copyOfNames = List.copyOf(names);
//        doNotChange(names);
//        System.out.println(names);
        doNotChange(copyOfNames);
        System.out.println(copyOfNames);
    }

    private static void doNotChange(List<String> names) {
        names.add("ShouldNotbeAllowed");
    }
}
