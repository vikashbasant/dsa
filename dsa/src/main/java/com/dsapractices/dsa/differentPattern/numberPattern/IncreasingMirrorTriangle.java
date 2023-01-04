package com.dsapractices.dsa.differentPattern.numberPattern;

import java.util.Scanner;

public class IncreasingMirrorTriangle {

    /**
     * Print the IncreasingHollowTriangle Pattern:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void increasingMirrorTriangle(int size){

        // For Outer loop take care of how many rows print:
        for(int i=1, k=size; i<=size; i++,k--){

            // For Inner loop take care of how many columns print:
            int p = k;
            for(int j=1; j<=i; j++){
                System.out.print(p++ +" "); // What we need to print
            }

            // For new line:
            System.out.println();

        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        increasingMirrorTriangle(size);

    }
}
