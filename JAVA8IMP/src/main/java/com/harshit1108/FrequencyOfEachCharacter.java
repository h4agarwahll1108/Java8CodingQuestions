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

/*
Assuming inputString is a String, here's what each part of the code does:
inputString.chars(): This returns an IntStream of Unicode code points representing each character in the string inputString.
                     The chars() method is part of the CharSequence interface, and it provides an efficient way to work with the characters of a string.
.mapToObj(c -> (char) c): This maps each integer in the IntStream to its corresponding character by using the lambda expression (char) c.
                     It converts the IntStream to a Stream<Character>.
.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())): This collects the characters into a Map<Character, Long>.
            It uses the groupingBy collector, which groups the elements based on the provided classifier function (Function.identity() in this case).
            The classifier function is the identity function, which means it groups elements by their natural value (the characters in this case).
            The second argument to groupingBy is a downstream collector, Collectors.counting().
            This downstream collector counts the occurrences of each character in the input stream.
 */
