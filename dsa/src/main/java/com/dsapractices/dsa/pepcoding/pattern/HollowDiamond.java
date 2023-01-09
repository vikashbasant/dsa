package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class HollowDiamond {

    /**
     * Hollow Diamond:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void hollowDiamond(int size){
        int os = size/2;
        int is = -1;
        // For Row:
        for(int i=1; i<=size; i++){
            // For Outer Space:
            for(int j=1; j<=os; j++){
                System.out.print("  ");
            }
            // One Star:
            System.out.print("* ");

            // For Inner Space:
            for(int j=1; j<=is; j++){
                System.out.print("  ");
            }

            // One Star: First Row and Last Row only 1 star:
            if(i > 1 && i<size){
                System.out.print("* ");
            }

            // Condition:
            if(i <= size/2){
                os--;
                is+=2;
            }else{
                os++;
                is-=2;
            }

            // For New Line:
            System.out.println();


        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        hollowDiamond(size);
    }
}
