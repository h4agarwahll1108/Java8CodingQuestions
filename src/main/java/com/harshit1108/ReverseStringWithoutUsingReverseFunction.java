package com.harshit1108;

import java.util.Arrays;

public class ReverseStringWithoutUsingReverseFunction {
    public static void main(String[] args) {
        String s = "Harshit";
        String[] s1 = s.split("");
        String[] s2 = new String[s1.length];
        int j=0;
        for(int i=s1.length-1;i>=0;i--){
            s2[j]=s1[i];
            j++;
        }
        for (String string : s2) {
            System.out.print(string); //tihsraH
        }


    }
}
