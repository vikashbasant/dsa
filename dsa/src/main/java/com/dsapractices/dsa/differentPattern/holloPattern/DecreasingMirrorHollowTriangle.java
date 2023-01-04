package com.dsapractices.dsa.differentPattern.holloPattern;

import java.util.Scanner;

public class DecreasingMirrorHollowTriangle {

    /**
     * Print the decreasing triangle pattern:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void decreasingMirrorHollowTriangle(int size){
        // Outer Loop for How many rows we need to print:
        for (int i=1; i<=size; i++) {
            // Inner Loop for how many column we need to print:
            for(int j=i; j<=size; j++){
                // For Print decreasing hollow pattern:
                if(j==i || i==1 || j == size)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            // for new line:
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        decreasingMirrorHollowTriangle(size);

    }
}
