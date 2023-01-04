package com.dsapractices.dsa.differentPattern.starPattern;

import java.util.Scanner;

public class DiamondPattern {

    /**
     * Print the Diamond Pattern:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void diamondPattern(int size){

        // For Hill Pattern:
        for (int i = 1; i < size; i++) {

            // For Decreasing triangle of space:
            for(int j=i; j<size; j++){
                System.out.print("  ");
            }

            // For Increasing triangle of star:
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }

            // For Increasing triangle of star:
            for(int k=1; k<i; k++){
                System.out.print("* ");
            }

            // For new line:
            System.out.println();
        }

        // For reverse Hill Pattern:
        for (int i = 1; i <= size; i++) {

            // For Increasing triangle of space:
            for(int k=1; k<i; k++){
                System.out.print("  ");
            }

            // For Decreasing triangle of star:
            for(int j=i; j<=size; j++){
                System.out.print("* ");
            }

            // For Decreasing triangle of star:
            for(int j=i; j<size; j++){
                System.out.print("* ");
            }

            // For new line:
            System.out.println();

        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        diamondPattern(size);
    }
}
