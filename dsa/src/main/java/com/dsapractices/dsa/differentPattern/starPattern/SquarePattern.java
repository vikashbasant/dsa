package com.dsapractices.dsa.differentPattern.starPattern;

import java.util.Scanner;

public class SquarePattern {

    /**
     * Print Square Pattern:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void printSquare(int size){
        // Outer take care how many times loop is running:
        for (int i = 1; i <= size; i++) {
            // Inner Loop print the star:
            for(int j=1; j<=size; j++){
                System.out.print(j+" ");
            }
            // For new line we are taking:
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        printSquare(size);
    }
}
