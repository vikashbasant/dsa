package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class LeftArrow {

    /**
     * Left Arrow:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void leftArrow(int size){
        int sp = size/2, st = 1;
        // For Row:
        for(int i=1; i<=size; i++){
            // For Space:
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            // For Star:
            for(int j=1; j<=st; j++){
                System.out.print("* ");
            }

            // Condition:
            if(i <= size/2){
                sp--;
                st++;
            }else{
                sp++;
                st--;
            }

            // For New Line:
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        leftArrow(size);
    }
}
