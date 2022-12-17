package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;

public class FindAllFibonacciNumberTillN {

    /**
     * Print the Fibonacci Series till N.
     * @param num
     */
    private static void printAllFiboNum(int num){
        int a = 0, b = 1;
        while(a<=num){
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printAllFiboNum(num);
    }
}
