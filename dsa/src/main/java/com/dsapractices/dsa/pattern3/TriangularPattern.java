package com.dsapractices.dsa.pattern3;

import java.util.Scanner;

public class TriangularPattern {

    /**
     * All Type of triangular pattern:
     * TimeComplexity: O(num*i) i.e (i===num) in worst case O(num^2)
     * SpaceComplexity:O(1)
     * @param num
     */
    private static void printTriangularPattern(int num){
        for(int i=0; i<num; i++){ // Total number of rows:
            for(int j=0; j<=i; j++){ // Total number of columns:
                System.out.print("* "); // What we need to print:
            }
            System.out.println(); // For new line:
        }
    }

    /**
     * TimeComplexity: O(num^2)
     * SpaceComplexity: O(1)
     * @param num
     */
    private static void printTriangularPatternNumber(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static void reverseNumberPattern(int num){
        for(int i=1; i<=num; i++){
            int temp = i;
            for(int j=1; j<=i; j++){
                System.out.print(temp-- + " ");
            }
            System.out.println();
        }
    }

    private static void alphaPattern(int num){
        for(int i=1; i<=num; i++){
            int temp = i;
            for(int j=1; j<=i; j++){
                System.out.print((char)(64+i) + " ");
            }
            System.out.println();
        }
    }

    private static void characterPattern(int num){
        for(int i=1; i<=num; i++){
            int temp = i;
            for(int j=1; j<=i; j++){
                System.out.print((char)(64+temp) + " ");
                temp++;
            }
            System.out.println();
        }
    }

    private static void interestingAlphabets(int num){
        for(int i=1; i<=num; i++){
            char temp = (char)('A' + num - i);
            for(int j=1; j<=i; j++){
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printTriangularPattern(num);
    }
}
