package com.dsapractices.dsa.differentPattern.starPattern;

import java.util.Scanner;

public class DecreasingTriangle {

    /**
     * Print the decreasing triangle pattern:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void printDecreasingTriangle(int size){
        // Outer Loop for How many rows we need to print:
        for (int i=1; i<=size; i++) {
            // Inner Loop for how many column we need to print:
            for(int j=i; j<=size; j++){
                // what we need to print:
                System.out.print("* ");
            }
            // for new line:
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        printDecreasingTriangle(size);

    }
}
