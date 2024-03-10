package com.harshit1108;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {

    public static void main(String[] args) {

        String inputString = "Harshit Agarwal Software Developer";

        Map<Character,Long> mapChar = inputString.chars()
                                                .mapToObj(c->(char)c)
                                                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mapChar);
    }
}
