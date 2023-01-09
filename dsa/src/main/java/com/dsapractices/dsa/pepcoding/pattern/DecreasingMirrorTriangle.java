package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class DecreasingMirrorTriangle {

    /**
     * Decreasing Mirror Triangle:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void decreasingMirrorTriangle(int size){

        int sp = 0, st = size;
        // For Row:
        for(int i=size; i>=1; i--){
            // For Space:
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            // For Star:
            for(int j=1; j<=st; j++){
                System.out.print("* ");
            }
            // Condition:
            sp++;
            st--;
            // For New Line:
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        decreasingMirrorTriangle(size);
    }
}
