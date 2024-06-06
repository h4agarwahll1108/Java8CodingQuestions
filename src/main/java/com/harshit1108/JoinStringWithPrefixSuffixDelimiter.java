package com.harshit1108;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringWithPrefixSuffixDelimiter {

    public static void main(String[] args) {

        List<String> listOfString = Arrays.asList("Harshit","Agarwal","Software","Developer");

      String joinedString =   listOfString.stream()
                                          .collect(Collectors.joining(", ","[","]"));
        System.out.println(joinedString);
    }
}
