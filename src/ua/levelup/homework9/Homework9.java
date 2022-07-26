package ua.levelup.homework9;

import java.util.Arrays;

import static ua.levelup.homework9.FileReaderForMap.readFile;

public class Homework9 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(readFile(FileReaderForMap.FILE)));
    }
}
