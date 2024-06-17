package com.in28minutes.api.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Introduced in Java 11 , supports UTF-8
Files.readString(path)
Files.writeString(path,string)
 */
public class FileReadWriteRunner {
    public static void main(String[] args) throws IOException {

        // to READ
        Path path = Paths.get("./resources/sample.txt");
        String fileContent = Files.readString(path);
        System.out.println(fileContent);

        // to WRITE
        String newFileContent = fileContent.replace("World","Wonder");
        Path newFilePath = Paths.get("./resources/sample_new.txt");
        Files.writeString(newFilePath,newFileContent);
    }
}
