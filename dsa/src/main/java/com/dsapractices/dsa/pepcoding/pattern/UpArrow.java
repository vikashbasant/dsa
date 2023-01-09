package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class UpArrow {

    /**
     * Up Arrow:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void upArrow(int size){

        int sp = size/2, st = 1;

        // For Row:
        for(int i=1; i<=(size/2)+1; i++){
            // For Space:
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }

            // For Star:
            for(int j=1; j<=st; j++){
                System.out.print("* ");
            }

            // Condition:
            sp--;
            st+=2;

            // For New Line:
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        upArrow(size);
    }
}
