package com.harshit1108;

import java.util.Arrays;

public class SumAndAverageOfArray {

    public static void main(String[] args) {

        int[] array = new int[]{11,45,65,85,78,69,99};

        int sum = Arrays.stream(array).sum();

        System.out.println("Sum " + sum);

        double avg = Arrays.stream(array).average().getAsDouble();

        System.out.println(avg);

    }
}
