package com.harshit1108;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachElement {

    public static void main(String[] args) {

        List<String> listOfColors = Arrays.asList("Red","Blue","Green","Red","Green","Black");

        Map<String,Long> mapCount = listOfColors
                                    .stream()
                                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mapCount);
    }
}
