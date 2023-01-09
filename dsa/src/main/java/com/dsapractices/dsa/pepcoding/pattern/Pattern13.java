package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class Pattern13 {

    /**
     * Pattern 13:
     * Formula for this pattern is ic(j+1) = (icj * (i-j))/(j+1)
     *
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void pattern13(int size) {
        // For Row:
        for (int i = 0; i < size; i++) {
            int icj = 1;
            // For Col:
            for (int j = 0; j <= i; j++) {
                System.out.print(icj + " ");
                int icjp1 = (icj * (i - j)) / (j + 1);
                icj = icjp1;
            }
            // For New Line:
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        pattern13(size);
    }
}
