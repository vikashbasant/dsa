package com.dsapractices.dsa.pattern3;

import java.util.Scanner;

public class SquarePattern {

    /**
     * print square pattern:
     * @param row
     */
    private static void printSquarePattern(int row){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printSquarePattern(num);
    }
}
