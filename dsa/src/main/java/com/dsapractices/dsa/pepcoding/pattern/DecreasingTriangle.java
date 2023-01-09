package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class DecreasingTriangle {

    /**
     * Decreasing Triangle:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void decreasingTriangle(int size){

        // For Row:
        for(int i=size; i>=1; i--){
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
        decreasingTriangle(size);
    }

}
