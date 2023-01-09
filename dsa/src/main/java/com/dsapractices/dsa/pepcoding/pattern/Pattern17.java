package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class Pattern17 {

    /**
     * Pattern 17:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     *
     * @param size
     */
    private static void pattern17(int size) {

        int sp = size/2;
        int st = 1;

        // For Row:
        for(int i=1; i<=size; i++){
            // For Space:
            for (int j = 1; j <= sp; j++) {

                // Special Case: Only this row print the "*"
                if (i == ((size / 2) + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            // For Star:
            for (int j = 1; j <= st; j++) {
                System.out.print("* ");
            }

            // Condition:
            if(i <= size/2){
                st++;
            }else{
                st--;
            }

            // For New Line:
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        pattern17(size);
    }
}
