package com.dsapractices.dsa.differentPattern.holloPattern;

import java.util.Scanner;

public class DiamondPattern {

    private static void diamondPattern(int size){
        // For Hollow Hill Pattern:
        for (int i = 1; i < size; i++) {

            // For Decreasing triangle of space:
            for(int j=i; j<size; j++){
                System.out.print("  ");
            }

            // For Increasing triangle of star:
            for(int k=1; k<i; k++){
                // For Print the hollow increasing triangle:
                if(k == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // For Inner loop take care of how many columns print:
            for(int j=1; j<=i; j++){
                // For Print Mirror image of increasing hollow triangle:
                if(j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // For new line:
            System.out.println();
        }

        // For Reverse Hollow Hill Pattern:
        for (int i = 1; i <= size; i++) {
            // For Increasing triangle of space:
            for(int k=1; k<i; k++){
                System.out.print("  ");
            }
            // For Decreasing triangle of star:
            for(int j=i; j<size; j++){
                // For Decreasing Hollow triangle:
                if(j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // Inner Loop for how many column we need to print:
            for(int j=i; j<=size; j++){
                // For Print decreasing hollow pattern:
                if(j == size)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // For new line:
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        diamondPattern(size);
    }
}
