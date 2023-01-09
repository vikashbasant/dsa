package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class MajorDiagonal {

    /**
     * Major Diagonal:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void majorDiagonal(int size) {
        // For Row:
        for (int i = 1; i <= size; i++) {
            // For Column:
            for (int j = 1; j <= size; j++) {
                // For Major Diagonal:
                if ((i + j) == (size + 1)) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            // For New Line:
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        majorDiagonal(size);
    }
}
