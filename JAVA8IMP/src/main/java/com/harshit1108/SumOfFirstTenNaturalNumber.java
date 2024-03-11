package com.harshit1108;

import java.util.stream.IntStream;

public class SumOfFirstTenNaturalNumber {

    public static void main(String[] args) {

        int sum = IntStream.range(1,11).sum();

        System.out.println(sum);
    }
}
