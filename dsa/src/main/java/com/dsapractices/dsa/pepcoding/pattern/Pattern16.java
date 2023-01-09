package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class Pattern16 {

    /**
     * Pattern 16:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void pattern16(int size) {
        int sp = 2*size - 3;
        int st = 1;

        // For Row:
        for (int i = 1; i <= size; i++) {

            int cval = 1;

            // For Star:
            for (int j = 1; j <= st; j++) {
                System.out.print(cval++ + " ");
            }

            // For Space:
            for(int j = 1; j<=sp; j++){
                System.out.print("  ");
            }

            // boundary case for 1 extra *:
            if(i == size){
                st--;
                cval--;
            }
            // For Star:
            for (int j = 1; j <= st; j++) {
                System.out.print(--cval + " ");
            }

            // Condition:
            st+=1;
            sp-=2;

            // For New Line:
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        pattern16(size);
    }
}
