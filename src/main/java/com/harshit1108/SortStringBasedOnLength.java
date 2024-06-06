package com.harshit1108;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringBasedOnLength {

    public static void main(String[] args) {

        List<String> listOfString = Arrays.asList("Harshit","Agarwal","Software","Developer");

        listOfString.stream()
                    .sorted(Comparator.comparing(String::length).reversed())
                    .forEach(System.out::println);

    }
}
