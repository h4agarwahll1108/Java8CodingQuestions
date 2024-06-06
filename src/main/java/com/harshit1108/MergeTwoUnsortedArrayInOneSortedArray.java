package com.harshit1108;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArrayInOneSortedArray {

    public static void main(String[] args) {

        int[] array1 = {4,2,7,1};

        int[] array2 = {8,3,6,5};

        int[] c = IntStream.concat(Arrays.stream(array1),Arrays.stream(array2))
                           .sorted()
                           .toArray();

        System.out.println(Arrays.toString(c));

        int[] array3 = {1,3,6,5};

        int[] d = IntStream.concat(Arrays.stream(array1),Arrays.stream(array3))
                           .sorted()
                           .distinct()
                           .toArray();

        System.out.println(Arrays.toString(d));

    }
}
