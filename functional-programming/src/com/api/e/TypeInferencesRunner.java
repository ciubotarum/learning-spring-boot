package com.api.e;

import java.util.List;
import java.util.stream.Stream;

public class TypeInferencesRunner {
    public static void main(String[] args) {
        List<String> names1 = List.of("Mihaela", "Eva");
        List<String> names2 = List.of("John", "Adam");
//        var abc = null;  // null can't be initialized with null
//        List<List<String>> names = List.of(names1,names2); or else ...
        var names = List.of(names1,names2);

        names.stream().forEach(System.out::println);

        for (var name:names1) {
            System.out.println(name);

        }

        var filter = List.of("Mihaela", "Eva").stream().filter(s -> s.length() < 5);
        filter.forEach(System.out::println);
    }
}
