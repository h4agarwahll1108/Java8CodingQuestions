package com.harshit1108;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortInReverseOrder {

    public static void main(String[] args) {

        List<Integer> listOfInteger = Arrays.asList(15,45,23,58,17,13,42,89,33,78,71,85);

        listOfInteger.stream()
                    .sorted(Comparator.reverseOrder())
                    .forEach(System.out::println);

        int[] arr = {6,8,2,4,9};
        //boxed is used to convert primitives data types into object type
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::print);
    }
}
