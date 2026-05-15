package com.core.basics.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.RandomAccess;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileReadingInJava {
    public static void main(String[] args) throws IOException {

        // Read file data(text) line by line, Best suitable for large files.
        BufferedReader reader = new BufferedReader(new FileReader("FilePath"));

        // A simple way of reading the files with support of token based reading. Best suitable for small files.
        Scanner scanner = new Scanner(new File("Filepath"));

        // Read file data(text) lines as List<String>,  Best suitable for small to medium-sized files.
        List<String> line = Files.readAllLines(Paths.get("FilePath"));

        // Read file data(text) lines as Stream<String> , We can perform Stream operations on data.
        Stream<String> streamLines = Files.lines(Paths.get("FilePath"));

        // Read entire files content as a String value, Best suitable for small files.
        String fileContent = Files.readString(Paths.get("FilePath"));

        // Read the data in Binary or text format. Best suitable for large files.
        FileInputStream fs = new FileInputStream("FilePath");

        // Allow us to read specific positions in a file.
        RandomAccessFile raf = new RandomAccessFile("Filepath", "r");

    }
}
