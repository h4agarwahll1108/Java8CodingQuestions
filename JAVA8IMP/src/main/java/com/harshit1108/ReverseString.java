package com.harshit1108;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Harshit Agarwal Software Developer";

        String reverseString = Arrays.stream(str.split(""))
                .reduce("",(s,c)->c+s);

        System.out.println(reverseString);
    }
}
/*
Input String: "abc"

.split(""):

Splits the string into an array of characters: ["a", "b", "c"]
.stream():

Converts the array into a stream of characters: Stream<String>
.reduce("", (s, c) -> c + s):

Initial identity value (empty string): ""
The binary operator (s, c) -> c + s is applied for each element in the stream.
In the first iteration, s is the identity (empty string), and c is "a". The result is "a" + "" = "a".
In the second iteration, s is now "a", and c is "b". The result is "b" + "a" = "ba".
In the third iteration, s is "ba", and c is "c". The result is "c" + "ba" = "cba".
Result:

The final result is "cba", which is the reversed string of the input "abc".
 */