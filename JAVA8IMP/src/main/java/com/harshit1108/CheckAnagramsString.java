package com.harshit1108;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckAnagramsString {

    public static void main(String[] args) {

        String s1 = "RaceCar";

        String s2 = "CarRace";

        s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        s2 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        if(s1.equals(s2)){
            System.out.println("EQUAL");
        }
        else
        {
            System.out.println("NOT EQUAL");
        }
    }
}

/**
 * Assuming s1 is a string, here's what each part of the code does
 * s1.split(""): This splits the string s1 into an array of strings where each element is a single character. The empty string "" as the argument for split means that it will split the string at every character.
 * Stream.of(...): This creates a stream from the array of strings obtained from the split operation. Each element of the array becomes a separate element in the stream.
 * map(String::toUpperCase): This transforms each element of the stream by applying the toUpperCase method on each string. This converts each character to its uppercase form.
 * sorted(): This sorts the elements of the stream in their natural order. Since the elements are now strings (characters in uppercase), the natural order is alphabetical.
 * collect(Collectors.joining()): This collects the elements of the stream into a single string by concatenating them. The Collectors.joining() method is used here without any arguments, so it concatenates the elements without any delimiter.
**/