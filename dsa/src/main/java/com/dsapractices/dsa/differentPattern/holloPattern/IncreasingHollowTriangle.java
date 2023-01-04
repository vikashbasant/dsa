package com.dsapractices.dsa.differentPattern.holloPattern;

import java.util.Scanner;

public class IncreasingHollowTriangle {

    /**
     * Print Right Sided Pattern:
     * TimeComplexity: O(Size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void increasingTriangle(int size) {

        for (int i = 1; i <= size; i++) {

            // For Decreasing triangle of space:
            for(int j=i; j<size; j++){
                System.out.print("  ");
            }

            // For Increasing triangle of star:
            for(int k=1; k<=i; k++){
                // For Print the hollow increasing triangle:
                if(k == 1 || k == i || i == size )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // For new line:
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        increasingTriangle(size);

    }
}
