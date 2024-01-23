package com.api.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\ciubo\\OneDrive\\Desktop\\udemy\\functional-programming\\src\\com\\resources\\sample.txt");
        String fileContent = Files.readString(path);
        System.out.println(fileContent);
        String newFileContent = fileContent.replace("Line", "Lines");

        Path newFilePath = Paths.get("C:\\Users\\ciubo\\OneDrive\\Desktop\\udemy\\functional-programming\\src\\com\\resources\\sample-new.txt");
        Files.writeString(newFilePath, newFileContent);
    }
}

