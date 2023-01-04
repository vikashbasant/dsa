package com.dsapractices.dsa.differentPattern.holloPattern;

import java.util.Scanner;

public class PrintMiddleColumn {
    private static void squarePattern(int size){
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // For Middle Column:
                if(j == (size/2)+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        squarePattern(size);
    }
}
