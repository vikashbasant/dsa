package com.dsapractices.dsa.service;

import java.util.Scanner;

public class MultiplicationOfMatrix {

    /**
     * Multiplication of two matrix:
     * TimeComplexity: O(N^3)
     * SpaceComplexity: O(N^2)
     * @param arr1
     * @param n1
     * @param m1
     * @param arr2
     * @param n2
     * @param m2
     * @return
     */
    private static int[][] multiplicationOfMatrix(int[][] arr1, int n1, int m1, int[][] arr2, int n2, int m2) {
        int[][] result = new int[n1][m2];

        // For the Rows:
        for(int i=0; i<n1; i++){
            // For the columns:
            for(int j=0; j<m2; j++){
                // For the Rows
                for(int k=0; k<n2; k++){
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return result;
    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        // Taking Input array in arr1:
        int n1 = scan.nextInt();
        int m1 = scan.nextInt();
        int[][] arr1 = new int[n1][m1];
        for(int i=0; i<n1; i++){
            for(int j=0; j<m1; j++){
                arr1[i][j] = scan.nextInt();
            }
        }

        // Taking Input array in arr2:
        int n2 = scan.nextInt();
        int m2 = scan.nextInt();
        int[][] arr2 = new int[n2][m2];
        for(int i=0; i<n2; i++){
            for(int j=0; j<m2; j++){
                arr2[i][j] = scan.nextInt();
            }
        }

        if(m1 != n2){
            System.out.println("The number of columns in matrix arr1 is not equal to number of rows in matrix arr2");
        }else{
            int[][] result = multiplicationOfMatrix(arr1,n1,m1, arr2,n2,m2);
            for (int[] row : result) {
                for(int ele: row){
                    System.out.print(ele+" ");
                }
                System.out.println();
            }
        }





    }
}
