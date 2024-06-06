package com.harshit1108;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Harshit","Shivangi","Harshit","Pragati") ;

        List<String> uniqueString = listOfStrings
                                    .stream()
                                    .distinct()
                                    .collect(Collectors.toList());
        System.out.println(uniqueString);
    }
}
