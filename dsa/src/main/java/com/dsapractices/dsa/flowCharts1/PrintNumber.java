package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;

public class PrintNumber {

    /**
     * print the number upto N
     * @param num
     */
    private static void print1ToN(int num){
        for(int i=1; i<=num; i++){
            System.out.print(i+" ");
        }
    }

    private static void print1ToNRecursion(int num){
        if(num <= 1){
            System.out.print(num+" ");
            return;
        }
        print1ToNRecursion(num-1);
        System.out.print(num + " ");
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        print1ToNRecursion(num);
    }

}
