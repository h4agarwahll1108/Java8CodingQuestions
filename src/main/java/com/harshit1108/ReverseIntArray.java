package com.harshit1108;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntArray {
    public static void main(String[] args) {

        int[] array = new int[]{11,14,16,18,22,30};

        int[] reversedArray = IntStream.rangeClosed(1,array.length)
                                .map(i->array[array.length-i])
                                .toArray();

        System.out.println(Arrays.toString(reversedArray));
    }
}
/*
IntStream.rangeClosed(1, array.length): Creates an inclusive range of integers from 1 to the length of the array.
For the given example array, this range is {1, 2, 3, 4, 5, 6}.

.map(i -> array[array.length - i]): Maps each index i to the corresponding element in the original array,
where the index is obtained by subtracting i from the length of the array.

When i = 1, the element at index array.length - 1 is selected (array[6 - 1]), which is 30.
When i = 2, the element at index array.length - 2 is selected (array[6 - 2]), which is 22.
And so on...
.toArray(): Collects the elements of the stream into an array.
 */