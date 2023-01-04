package com.dsapractices.dsa.differentPattern.numberPatternOwn;

import java.util.Scanner;

public class DecreasingNumberPattern {

    private static void decreasingNumberPattern(int size){
        for(int i=1; i<=size; i++){
            int k = 1;
            for(int j=i; j<=size; j++){
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        decreasingNumberPattern(size);
    }
}
