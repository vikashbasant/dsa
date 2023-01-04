package com.dsapractices.dsa.differentPattern.numberPatternOwn;

import java.util.Scanner;

public class DecreasingNumberMirrorPattern {

    private static void decreasingNumberMirrorPattern(int size){
        for (int i = 1; i <= size; i++) {
            // For Increasing triangle of space:
            for(int k=1; k<i; k++){
                System.out.print("  ");
            }
            // For Decreasing triangle of star:
            for(int j=i; j<=size; j++){
                System.out.print((size-j+i)+" ");
            }

            int k = 1;
            for(int j=i; j<=size; j++){
                System.out.print(k++ + " ");
            }
            // For new line:
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        decreasingNumberMirrorPattern(size);
    }
}
