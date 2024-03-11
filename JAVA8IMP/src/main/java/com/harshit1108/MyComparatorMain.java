package com.harshit1108;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class MyComparatorMain {

    public static void main(String[] args) {

        TreeSet<Integer> arr = new TreeSet<>(new MyComparator());
        arr.add(5);
        arr.add(4);
        arr.add(6);
        System.out.println(arr);
    }
}
