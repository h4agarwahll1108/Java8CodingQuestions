package com.harshit1108.Stack;

import java.util.Stack;

public class LargestRectangleInHistogramUsingStack {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || heights[i] < heights[stack.peek()])) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }


    public static void main(String[] args) {
        int[] height = {2,1,5,6,2,3};
        int result = largestRectangleArea(height);
        System.out.println(result);

    }
}