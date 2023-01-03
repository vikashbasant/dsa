package com.dsapractices.dsa.pattern4;

import java.util.Scanner;

public class InvertedTrianglePattern {

    private static void invertedTriangle(int num){
        for(int i=1; i<=num; i++){
            for(int j=i; j<=num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void invertedTriangleNumber(int num){
        for(int i=1; i<=num; i++){
            for(int j=i; j<=num; j++){
                System.out.print(num-i+1 + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        invertedTriangleNumber(num);
    }
}
