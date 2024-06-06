package com.harshit1108;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinNumber {

    public static void main(String[] args) {

        List<Integer> listOfInteger = Arrays.asList(45,12,78,94,34,11,14);

        int max = listOfInteger.stream().max(Comparator.naturalOrder()).get();

        System.out.println("Maximun Element: " + max);

        int min = listOfInteger.stream().min(Comparator.naturalOrder()).get();

        System.out.println("Minimum Element: " + min);
    }
}
