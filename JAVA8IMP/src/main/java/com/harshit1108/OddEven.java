package com.harshit1108;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class OddEven {

    public static void main(String[] args) {

        List<Integer> listOfInteger = Arrays.asList(71,18,42,21,67,32,95,14,56,87);

        //OddEven-- True => Size = 5, False => Size = 5[If partitionBy Condition return true or false.
        //Map Size is 2 [True,False] based on these key values is stored
        Map<Boolean, List<Integer>> oddEvenMap =  listOfInteger
                                                    .stream()
                                                    .collect(Collectors.partitioningBy(i->i%2==0));

        Set<Map.Entry<Boolean,List<Integer>>> entrySet = oddEvenMap.entrySet();
        //First False key value will execute than True key value
        for(Map.Entry<Boolean,List<Integer>> entry : entrySet){
            //If key value is truer than it will execute
            if(entry.getKey()){
                System.out.println("Even Number");
            }
            else {
                System.out.println("Odd Numbers");
            }

            List<Integer> list = entry.getValue();
            for(int i : list){
                System.out.println(i);
            }
        }
    }
}
