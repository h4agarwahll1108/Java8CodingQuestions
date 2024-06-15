package com.harshit1108.Stack;

import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) {
        String input = "3[a2[c]]";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int count =0;
        StringBuilder charString = new StringBuilder();
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                /*(c - '0') converts the character digit c to its integer value. For example, if c is '3', then '3' - '0' results in 3.
                  count * 10 shifts the current value of count one place to the left (in decimal system).*/
                count = count*10 +(c-'0');
            } else if(c =='['){
                    countStack.push(count);
                    stringStack.push(charString.toString());
                    count=0;
                    charString = new StringBuilder();
            } else if(c==']'){
                StringBuilder decodeString = new StringBuilder(stringStack.pop());
                int repeat = countStack.pop();
                /*
                * for(inti=0i<repeat;i++){decodedString.append(charString);*/
                decodeString.append(charString.toString().repeat(Math.max(0, repeat)));
                charString = new StringBuilder(decodeString.toString());
            } else {
                charString.append(c);
            }
        }
        System.out.println(charString);
    }
}
/*Example 1:
Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:
Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:
Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"*/