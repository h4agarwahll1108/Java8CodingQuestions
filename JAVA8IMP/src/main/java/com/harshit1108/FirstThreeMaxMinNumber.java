package com.harshit1108;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FirstThreeMaxMinNumber {

    public static void main(String[] args) {

        List<Integer> listOfInteger = Arrays.asList(45,12,78,94,34,11,14);

        System.out.println("Minimum Element: ");
        //Deafault Sorting is in ASC order 1-2-3-4....
        listOfInteger.stream().sorted().limit(3).forEach(System.out::println);

        System.out.println("Maximun Element: ");

        listOfInteger.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);


    }
}
