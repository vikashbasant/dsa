package com.dsapractices.dsa.differentPattern.numberPattern;

import java.util.Scanner;

public class DecreasingMirrorTriangle {

    /**
     * Print the decreasing triangle pattern:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void decreasingMirrorTriangle(int size){

        // Outer Loop for How many rows we need to print:
        for (int i=1; i<=size; i++) {

            // Inner Loop for how many column we need to print:
            for(int j=i, p=i; j<=size; j++,p++){
                // what we need to print:
                System.out.print(p+" ");
            }

            // for new line:
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        decreasingMirrorTriangle(size);

    }
}
