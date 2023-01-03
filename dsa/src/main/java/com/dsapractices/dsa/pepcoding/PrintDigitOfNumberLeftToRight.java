package com.dsapractices.dsa.pepcoding;

import java.util.Scanner;

public class PrintDigitOfNumberLeftToRight {


    /**
     * Count the digit of the number:
     * TimeComplexity: O(log(num))
     * SpaceComplexity: O(1)
     * @param num
     * @return
     */
    private static int digitCount(int num){
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }

    /**
     * print the digit of the number from left to right:
     * TimeComplexity: O(log(num))
     * SpaceComplexity: O(1)
     * @param num
     * @param divisor
     */
    private static void printDigitHelper(int num, int divisor){
        while(num>0 || divisor != 0){ // divisor != 0 is for case like 100, 200, 300, 200000
            // Find the Quotient
            int term = num/divisor;
            // Print the Quotient
            System.out.println(term);
            // Again pass the Remainder
            num%=divisor;
            // Again pass the divisor/10
            divisor/=10;
        }
    }

    /**
     * print the digit of the number from left to right:
     * TimeComplexity: O(log(num))
     * SpaceComplexity: O(1)
     * @param num
     * @param divisor
     */
    private static void printDigitHelperBetter(int num, int divisor){
        while(divisor != 0){
            // Find the Quotient
            int term = num/divisor;
            // Print the Quotient
            System.out.println(term);
            // Again pass the Remainder
            num%=divisor;
            // Again pass the divisor/10
            divisor/=10;
        }
    }

    /**
     * TimeComplexity: O(log(num))
     * SpaceComplexity: O(1)
     * @param num
     */
    private static void printDigit(int num){
        int countDigit = digitCount(num);
        int divisor = (int) Math.pow(10,(countDigit-1));
        printDigitHelperBetter(num, divisor);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printDigit(num);
    }
}
