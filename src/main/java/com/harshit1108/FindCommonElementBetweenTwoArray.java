package com.harshit1108;

import java.util.Arrays;
import java.util.List;

public class FindCommonElementBetweenTwoArray {

    public static void main(String[] args) {

        List<Integer> firstList = Arrays.asList(11,15,25,35,44);

        List<Integer> secondList =  Arrays.asList(44,16,45,11,4);

        firstList.stream()
                 .filter(secondList::contains)
                 .forEach(System.out::println);
    }
}
