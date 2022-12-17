package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;

public class MemberOfFibonacciSeries {

    /**
     * Check number N is part of Fibonacci series or not:
     * @param num
     * @return
     */
    private static boolean isMemberOfFibonacciSeries(int num){
        int a = 0, b = 1;
        while(a < num){
            int c = a+b;
            a = b;
            b = c;
        }
        if(a == num){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean result = isMemberOfFibonacciSeries(num);
        System.out.println("result = " + result);
    }
}
