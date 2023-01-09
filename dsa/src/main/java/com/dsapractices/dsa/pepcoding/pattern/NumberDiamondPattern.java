package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class NumberDiamondPattern {

    /**
     * Number Diamond Pattern:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void numberDiamondPattern(int size) {

        // sp: for space, st: how many number, sn = number start with each row:
        int sp = size/2, st=1, sn = 1;

        // How many rows:
        for (int i = 1; i <= size; i++) {

            // How many space in each row:
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }

            // val start printing with sn:
            int val = sn;
            // how many times number is print:
            for(int j=1; j<=st; j++){
                System.out.print(val + " ");
                // after half iteration val is decreasing:
                if(j <= st/2){
                    val++;
                }else{
                    val--;
                }
            }

            // Condition:
            if(i <= size/2){
                sn++;
                sp--;
                st+=2;
            }else{
                sn--;
                sp++;
                st-=2;
            }

            // For new line:
            System.out.println();


        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        numberDiamondPattern(size);
    }
}
