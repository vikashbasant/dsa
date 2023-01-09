package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class Pattern20 {

    /**
     * Pattern 20:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void pattern20(int size) {

        int st = size/2, sp = 1;
        // For Row:
        for (int i = 1; i <= size; i++) {
            // For Star:
            for (int j = 1; j <= size; j++) {
                // If Row < size/2:
                if (i <= size / 2) {
                    if (j == 1 || j == size) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                // If Row == size/2+1:
                } else if(i == size/2+1){
                    if (j == 1 || j == size || j == size/2+1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                // If Row > size/2
                } else if (i > size / 2 + 1) {
                    if (j == 1 || j == size || (i+j) == size+1 || (i == j)) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }

            }
            // For New Line:
            System.out.println();
        }
    }


    private static void pattern20BySir(int size) {
        // For Row:
        for (int i = 1; i <= size; i++) {
            // For Star:
            for (int j = 1; j <= size; j++) {
                // For J == 1 || J == size:
                if (j == 1 || j == size) {
                    System.out.print("* ");
                // For Row > size/2 and major diagonal or minor diagonal:
                } else if (i > size / 2 && (i == j || (i + j) == (size + 1))) {
                    System.out.print("* ");
                // Other than Space:
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
        pattern20BySir(size);
    }
}
