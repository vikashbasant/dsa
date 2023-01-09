package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class Pattern6 {

    /**
     * Pattern 6:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void pattern6(int size){
        int st = (size/2)+1, sp = 1;

        // For Row:
        for(int i=1; i<=size; i++){
            // For Star:
            for(int j=1; j<=st; j++){
                System.out.print("* ");
            }
            // For Space:
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }

            // For Star:
            for(int j=1; j<=st; j++){
                System.out.print("* ");
            }

            // Condition:
            if(i <= (size/2)){
                st--;
                sp+=2;
            }else{
                st++;
                sp-=2;
            }

            // For New Line:
            System.out.println();


        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        pattern6(size);
    }
}
