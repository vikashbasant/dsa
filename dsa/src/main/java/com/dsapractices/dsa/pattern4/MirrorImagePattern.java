package com.dsapractices.dsa.pattern4;

import java.util.Scanner;

public class MirrorImagePattern {

    private static void mirrorImage(int num){
        for(int i=1; i<=num; i++){
            // For space:
            for(int j=1; j<=(num-i); j++){
                System.out.print("  ");
            }
            // For star:
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void mirrorImageNumber(int num){
        for(int i=1; i<=num; i++){
            // For space:
            for(int j=1; j<=(num-i); j++){
                System.out.print("  ");
            }
            // For star:
            for(int k=1; k<=i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        mirrorImageNumber(num);
    }
}
