package com.harshit1108;

import java.util.Arrays;
import java.util.List;

public class PrintNumberMultipleByX {

    public static void main(String[] args) {

        List<Integer> listOfInteger = Arrays.asList(12,45,50,88,95,68,78,35,25,49);

        listOfInteger.stream()
                     .filter(i->i%5==0)
                     .forEach(System.out::println);
    }
}
