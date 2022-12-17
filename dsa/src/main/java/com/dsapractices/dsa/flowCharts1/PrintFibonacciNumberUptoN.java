package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;

public class PrintFibonacciNumberUptoN {

    /**
     * Print the Fibonacci series till less or equal to num:
     * @param num
     */
    private static void printFibonacci(int num){
        int a = 0, b = 1;
        for(int i=0; i<=10; i++){
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printFibonacci(num);

    }
}
