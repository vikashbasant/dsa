package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class DownArrow {

    /**
     * Down Arrow:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void downArrow(int size){

        int sp = 0, st = size;
        // For Row:
        for(int i=size; i>size/2; i--){
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
            st-=2;
            // For New Line:
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        downArrow(size);
    }
}
