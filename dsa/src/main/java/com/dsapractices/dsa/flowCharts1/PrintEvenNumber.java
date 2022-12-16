package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;

public class PrintEvenNumber {

    /**
     * print the even from 1 to N (Both inclusive)
     * @param num
     */
    private static void printEven1ToN(int num){
        for(int i=2; i<=num; i+=2){
            System.out.print(i+ " ");
        }
    }

    private static void printEven1ToNRecursion(int num){
        if(num == 1){
            return;
        }
        printEven1ToNRecursion(num-1);
        if(num % 2 == 0){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printEven1ToNRecursion(num);
    }
}
