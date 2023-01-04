package com.dsapractices.dsa.differentPattern.holloPattern;

import java.util.Scanner;

public class IncreasingMirrorHollowTriangle {

    /**
     * Print the IncreasingHollowTriangle Pattern:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void increasingMirrorHollowTriangle(int size){
        // For Outer loop take care of how many rows print:
        for(int i=1; i<=size; i++){
            // For Inner loop take care of how many columns print:
            for(int j=1; j<=i; j++){
                // For Print Mirror image of increasing hollow triangle:
                if(j == 1 || i == size || i == j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // For new line:
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        increasingMirrorHollowTriangle(size);

    }
}
