package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class IncreasingTriangle {

    /**
     * Increasing Triangle:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void increasingTriangle(int size){
        // For Row:
        for(int i=1; i<=size; i++){
            // For Star:
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // For New Line:
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        increasingTriangle(size);
    }
}
