package com.harshit1108;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortInReverseOrder {

    public static void main(String[] args) {

        List<Integer> listOfInteger = Arrays.asList(15,45,23,58,17,13,42,89,33,78,71,85);

        listOfInteger.stream()
                    .sorted(Comparator.reverseOrder())
                    .forEach(System.out::println);
    }
}
