package com.dsapractices.dsa.differentPattern.starPattern;

import java.util.Scanner;

public class IncreasingTriangle {

    /**
     * Print the IncreasingHollowTriangle Pattern:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void printIncreasingTriangle(int size){
        // For Outer loop take care of how many rows print:
        for(int i=1; i<=size; i++){
            // For Inner loop take care of how many columns print:
            for(int j=1; j<=i; j++){
                System.out.print("* "); // What we need to print
            }
            // For new line:
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        printIncreasingTriangle(size);

    }
}
