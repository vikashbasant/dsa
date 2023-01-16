package com.dsapractices.dsa.pepcoding.numberSystem;

import java.util.Scanner;

public class DigitFrequency {

    private static int findDigitFreq (int num, int digit) {
        int countDigit = 0;
        while (num > 0) {
            // getting remainder:
            int remDigit = num%10;

            // check the condition:
            if (remDigit == digit) {
                countDigit++;
            }

            // assign quotient:
            num/=10;
        }
        return countDigit;
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int digit = scan.nextInt();
        int result = findDigitFreq(num, digit);
        System.out.println("result = " + result);
    }
}
