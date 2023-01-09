package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class RightArrow {

    /**
     * Right Arrow:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void rightArrow(int size){

        int st = 1;
        // For Row:
        for(int i=1; i<=size; i++){
            // For Star:
            for(int j=1; j<=st; j++){
                System.out.print("* ");
            }
            // Condition:
            if(i <= (size/2)){
                st++;
            }else{
                st--;
            }
            // For New Line:
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        rightArrow(size);
    }
}
