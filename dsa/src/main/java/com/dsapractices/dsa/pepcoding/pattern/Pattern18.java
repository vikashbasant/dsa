package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class Pattern18 {

    /**
     * Pattern 18:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void pattern18(int size) {

        int sp = 0;
        int st = size;

        // For Row:
        for (int i = 1; i <= size; i++) {

            // For Space:
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }

            // For Star:
            for (int j = 1; j <= st; j++) {

                // For Special Case:
                if (i>1 && i <= size / 2 && j>1 && j<st ) {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }

            }

            // Condition:
            if (i <= size / 2) {
                sp++;
                st -= 2;
            } else {
                sp--;
                st+=2;
            }

            // For New Line:
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        pattern18(size);
    }
}
