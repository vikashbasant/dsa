package com.dsapractices.dsa.differentPattern.numberPatternOwn;

import java.util.Scanner;

public class DiamondPattern {

    private static void diamondPattern(int size){

        // hill pattern:
        for(int i=1; i<size; i++){

            // For Decreasing triangle of space:
            for(int j=1; j<=size-i; j++){
                System.out.print("  ");
            }

            // For Increasing triangle of number:
            int temp = size;
            for(int j=1; j<i; j++){
                System.out.print(temp-- + " ");
            }

            // For Increasing triangle of number:
            for(int j=1; j<=i; j++){
                System.out.print(size+j-i + " ");
            }

            // For New Line:
            System.out.println();
        }

        // reverse hill pattern:
        for (int i = 1; i <= size; i++) {
            // For Increasing triangle of space:
            for(int k=1; k<i; k++){
                System.out.print("  ");
            }
            // For Decreasing triangle of star:
            for(int j=i; j<=size; j++){
                System.out.print((size-j+i)+" ");
            }


            // For Decreasing triangle of star:
            for(int j=i; j<size; j++){
                System.out.print(j+1 + " ");
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
