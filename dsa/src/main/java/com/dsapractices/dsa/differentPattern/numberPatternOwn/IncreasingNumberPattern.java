package com.dsapractices.dsa.differentPattern.numberPatternOwn;

import java.util.Scanner;

public class IncreasingNumberPattern {

    private static void increasingNumberPattern(int size) {

        for(int i=1; i<=size; i++){

            // For Decreasing triangle of space:
            for(int j=1; j<=size-i; j++){
                System.out.print("  ");
            }

            // For Increasing triangle of star:
            int temp = size;
            for(int j=1; j<=i; j++){
                System.out.print(temp-- + " ");
            }

            // For New Line:
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        increasingNumberPattern(size);
    }

}
