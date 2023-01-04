package com.dsapractices.dsa.differentPattern.holloPattern;

import java.util.Scanner;

public class ReverseHollowHillPattern {

    private static void reverseHollowHillPattern(int size){
        for (int i = 1; i <= size; i++) {
            // For Increasing triangle of space:
            for(int k=1; k<i; k++){
                System.out.print("  ");
            }
            // For Decreasing triangle of star:
            for(int j=i; j<size; j++){
                // For Decreasing Hollow triangle:
                if(i == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // Inner Loop for how many column we need to print:
            for(int j=i; j<=size; j++){
                // For Print decreasing hollow pattern:
                if(i==1 || j == size)
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
        reverseHollowHillPattern(size);
    }
}
