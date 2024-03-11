package com.harshit1108;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigits {

    public static void main(String[] args) {
        int i = 11081998;

        Integer sum = Stream.of(String.valueOf(i).split(""))
                            .collect(Collectors.summingInt(Integer::parseInt));

       // Integer sum = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();

        System.out.println(sum);
    }
}
/*
Assuming i is an integer, here's what each part of the code does:
String.valueOf(i).split(""): This converts the integer i to its string representation using String.valueOf(i).
        Then, it uses split("") to split the string into an array of strings where each element is a single digit.
Stream.of(...): This creates a stream from the array of strings obtained from the split operation.
        Each element of the array becomes a separate element in the stream.
.collect(Collectors.summingInt(Integer::parseInt)): This collects the elements of the stream by summing the integer values obtained by parsing each string element.
        The summingInt collector is a downstream collector that calculates the sum of the integer values extracted from the stream elements.
Integer::parseInt is a method reference to the static method parseInt in the Integer class, which converts each string to an integer.
*/

/*
.mapToInt(Integer::parseInt): This transforms each element of the stream by applying the parseInt method, converting each string to an integer.
    This results in an IntStream.
.sum(): This terminal operation calculates the sum of all the integers in the IntStream.
        It adds up the individual integers obtained from parsing the string representation of the original integer i.
 */
