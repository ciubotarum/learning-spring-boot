package com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FileReadRunner {
    public static void main(String[] args) throws IOException {
//      How to read from a file
        Path pathFileToRead = Paths.get("C:\\Users\\ciubo\\OneDrive\\Desktop\\udemy\\functional-programming\\src\\com\\files\\resources\\data.txt");
        // for large text is not good
//        List<String> lines = Files.readAllLines(pathFileToRead);
//        System.out.println(lines);

        Files.lines(pathFileToRead)
                .map(String::toLowerCase)
                .filter(str -> str.contains("a"))
                .forEach(System.out::println);

    }

}
