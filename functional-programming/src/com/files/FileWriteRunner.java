package com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {
    public static void main(String[] args) throws IOException {
//      How to write in a file
        Path pathFileToWrite = Paths.get("C:\\Users\\ciubo\\OneDrive\\Desktop\\udemy\\functional-programming\\src\\com\\files\\resources\\file-write.txt");

        List<String> list = List.of("Apple", "Boy", "Cat", "Dog", "Elephant");

        Files.write(pathFileToWrite, list);

    }

}
