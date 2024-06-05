package com.harshit1108;

import java.util.Arrays;

public class BinarySearch2DMatrix {
    public static boolean searchInMatrix(int[][] matrix, int target){

        if(matrix == null || matrix.length ==0 || matrix[0].length==0){
            return false;
        }

        int m = matrix.length; //3
        int n=matrix[0].length; //4

        int start = 0 ;
        int end = m+n-1;

        while(start<=end) {
            int mid = (start+end)/2;
            int midX = mid/n;
            int midY = mid%n;

            if(matrix[midX][midY]==target){
                return true;
            }

            if(matrix[midX][midY]<target){
                start =mid + 1;
            } else {
                end = mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
//      /*  // Iterate through the rows
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }*/

        // Convert the matrix to a stream of rows
        Arrays.stream(matrix)
                // For each row, convert it to a stream of elements
                .forEach(row -> {
                    // Convert the row to a stream of elements and join them with a space
                    String rowString = Arrays.stream(row)
                            .mapToObj(Integer::toString) //Example: For row {1, 3, 5, 7}, this step will create a stream of ["1", "3", "5", "7"].
                            .reduce((a, b) -> a + " " + b) //Example: The stream ["1", "3", "5", "7"] will be reduced to "1 3 5 7"
                            .orElse("");
                    // Print the row
                    System.out.println(rowString);
                });
        Boolean res =  searchInMatrix(matrix,14);
        System.out.println(res);
    }





}
