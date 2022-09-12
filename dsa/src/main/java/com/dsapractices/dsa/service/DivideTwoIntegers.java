package com.dsapractices.dsa.service;

import java.util.Scanner;

public class DivideTwoIntegers {
    private static int divideHelper(int dividend, int divisor){
        // Base Case:
        if(dividend == 1 || dividend == 0){
            return 0;
        }
        // Induction Hypothesis:
        int smallOutput = divideHelper(dividend-divisor, divisor);

        // Induction Step:
        return 1+smallOutput;

    }
    public static int divide(int dividend, int divisor) {
        int result;
        if(dividend<0 && divisor<0){
            result = divideHelper(-dividend, -divisor);
        }else if(dividend<0){
            result = -divideHelper(-dividend, divisor);
        }else if(divisor<0){
            result = -divideHelper(dividend, -divisor);
        }else{
            result = divideHelper(dividend, divisor);
        }
        return result;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dividend = scan.nextInt();
        int divisor = scan.nextInt();
        int divide = divide(dividend, divisor);
        System.out.println(divide);
    }
}
