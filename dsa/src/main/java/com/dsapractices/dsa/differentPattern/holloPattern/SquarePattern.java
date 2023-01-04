package com.dsapractices.dsa.differentPattern.holloPattern;

import java.util.Scanner;

public class SquarePattern {

    private static void squarePattern(int size){
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
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
