package com.example.basic.lesson10.example;

import java.io.*;
import java.util.*;

public class StandardIn {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream(args[0]));
        try (var file = new Scanner(System.in)) {
            while (file.hasNextLine()) {
                System.out.println(file.nextLine());
            }
        }
    }
}
