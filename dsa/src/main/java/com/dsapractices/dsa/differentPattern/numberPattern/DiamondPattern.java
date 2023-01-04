package com.dsapractices.dsa.differentPattern.numberPattern;

import java.util.Scanner;

public class DiamondPattern {

    private static void diamondPattern(int size){
        // Hill Pattern:
        for (int i = 1, k1 = size; i < size; i++, k1--) {

            // For Decreasing triangle of space:
            for (int j = i; j < size; j++) {
                System.out.print("  ");
            }

            // For Increasing triangle of star:
            for (int k = 1, p = size; k < i; k++, p--) {
                System.out.print(p + " ");
            }

            // For Inner loop take care of how many columns print:
            int p = k1;
            for (int j = 1; j <= i; j++) {
                System.out.print(p++ + " "); // What we need to print
            }

            // For new line:
            System.out.println();
        }

        // Reverse Hill Pattern:
        for (int i = 1; i <= size; i++) {
            // For Increasing triangle of space:
            for(int k=1; k<i; k++){
                System.out.print("  ");
            }
            // For Decreasing triangle of star:
            for(int j=i, p=size; j<size; j++){
                System.out.print(p--+" ");
            }

            // Inner Loop for how many column we need to print:
            for(int j=i, p=i; j<=size; j++,p++){
                // what we need to print:
                System.out.print(p+" ");
            }
            // For new line:
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        diamondPattern(size);
    }
}
