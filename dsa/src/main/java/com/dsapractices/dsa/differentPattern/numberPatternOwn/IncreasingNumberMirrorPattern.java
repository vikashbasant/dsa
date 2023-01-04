package com.dsapractices.dsa.differentPattern.numberPatternOwn;

import java.util.Scanner;

public class IncreasingNumberMirrorPattern {

    private static void increasingNumberMirrorPattern(int size){
        for(int i=1; i<=size; i++){
            // For increasing triangle of number:
            for(int j=1; j<=i; j++){
                System.out.print(size+j-i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        increasingNumberMirrorPattern(size);
    }
}
