package com.harshit1108;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestInArray {

    public static void main(String[] args) {
        List<Integer> listOfInteger = Arrays.asList(12,48,65,99,97,38,65,47);

        Integer secondLargest = listOfInteger.stream()
                                              .sorted(Comparator.reverseOrder())
                                              .skip(1)
                                              .findFirst()
                                              .get();

        System.out.println(secondLargest);
    }
}
