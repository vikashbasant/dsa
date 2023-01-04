package com.dsapractices.dsa.differentPattern.numberPattern;

import java.util.Scanner;

public class DecreasingTriangle {
    /**
     * Print Right Sided Pattern:
     * TimeComplexity: O(Size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void decreasingTriangle(int size) {

        for (int i = 1; i <= size; i++) {

            // For Increasing triangle of space:
            for(int k=1; k<i; k++){
                System.out.print("  ");
            }

            // For Decreasing triangle of star:
            for(int j=i, p=size; j<=size; j++){
                System.out.print(p--+" ");
            }

            // For new line:
            System.out.println();

        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        decreasingTriangle(size);

    }
}
