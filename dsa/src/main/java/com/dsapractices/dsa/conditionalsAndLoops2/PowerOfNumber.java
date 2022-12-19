package com.dsapractices.dsa.conditionalsAndLoops2;

import java.util.Scanner;

public class PowerOfNumber {

    /**
     * Find  x to the power n i.e (x^n):
     * @param x
     * @param n
     * @return
     */
    private static int power(int x, int n){
        int power = 1;
        for(int i=n; i>0; i--){
            power*=x;
        }
        return power;
    }

    private static int powerRec(int x, int n){
        // Base Case:
        if(n == 0){
            return 1;
        }
        // Induction Hypothesis:
        int smallResult = powerRec(x, n-1);

        // Induction Step:
        int finalResult = x * smallResult;
        return finalResult;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        int result = powerRec(x,n);
        System.out.println("Power(x,n) = x^n is " + result);
    }
}
