package com.harshit1108;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInAString {

    public static void main(String[] args) {

        String str = "Hsrshit Agarwal Software Developer";

        String reverseStr = Arrays.stream(str.split(" "))
                .map(word->new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(reverseStr);
    }
}
/*
Assuming str is a string, here's what each part of the code does:
str.split(" "): This splits the input string into an array of strings using a space as the delimiter.
        Each element in the array represents a word.
Arrays.stream(...): This creates a stream from the array of words.
.map(word -> new StringBuffer(word).reverse()): This maps each word in the stream to a StringBuffer containing its reversed version.
        The reverse() method is called on the StringBuffer to reverse the characters of each word.
.collect(Collectors.joining(" ")): This collects the reversed words into a single string by concatenating them with a space between each word.
        The Collectors.joining(" ") method is used with a space as the delimiter.
The result is a new string, reverseSt
 */