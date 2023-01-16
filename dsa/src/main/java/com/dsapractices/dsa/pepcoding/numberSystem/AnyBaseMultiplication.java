package com.dsapractices.dsa.pepcoding.numberSystem;

import java.util.Scanner;

public class AnyBaseMultiplication {

    private static final int BASE = 10;


    /**
     * Find the signalDigit Multiplication:
     * TimeComplexity: O(log(num1))
     * SpaceComplexity: O(1)
     * @param base For Given Base
     * @param num1 Given num1
     * @param digit digit of num2
     * @return just simply return rValue
     */
    private static int getProductWithSignalDigit (int base, int num1, int digit) {
        int carry = 0;
        int rValue = 0;
        int power = 1;

        // this loop iterate till num1>0 || carry > 0:
        while (num1 > 0 || carry > 0) {

            // find the last of num1:
            int rem = num1 % BASE;

            // calculate the product:
            int getProd = (rem * digit)+carry;

            // just put rValue += ((getProd % base) * power):
            rValue += (getProd % base) * power;

            // get carry:
            carry = getProd / base;

            // just power increment by double:
            power *= BASE;

            // just num1 need to smaller:
            num1 /= BASE;
        }

        // just return rValue:
        return rValue;
    }


    /**
     * Any Base Addition:
     * TimeComplexity: O(Log(num)) where (num1 == num2 == num)
     * SpaceComplexity: O(1)
     * @param num1 taking number num1 from keyboard
     * @param num2 taking number num2 from keyboard
     * @param base taking base of num1 and num2 from keyboard
     * @return just simply return output
     */
    private static int anyBaseAddition(int num1, int num2, int base) {

        int carry = 0;
        int result = 0;
        int power = 1;

        // checking condition (num1>0 || num2>0 || carry > 0):
        while (num1 > 0 || num2 > 0 || carry > 0) {

            // initialized rem1 and rem2 for digit:
            int rem1 = 0, rem2 = 0;

            // check the condition (num1>0):
            if (num1 > 0) {
                // get last digit of num1;
                rem1 = num1 % BASE;
                // get smaller number num1:
                num1 /= BASE;
            }

            // check the condition (num2 > 0):
            if (num2 > 0) {
                // get last digit of num2:
                rem2 = num2 % BASE;
                // get smaller number num2:
                num2 /= BASE;
            }

            // add both last digit of num1 and num2 and also carry:
            int total = rem1 + rem2 + carry;

            // calculate the result value:
            result += ((total % base) * power);

            // get the carry:
            carry = (total / base);

            // increment the power:
            power *= BASE;

        }
        return result;
    }



    /**
     * Any Base Multiplication:
     * TimeComplexity: O(Log(num) * Log(num)) where (num == num1 == num2)
     * SpaceComplexity: O(1)
     * @param num1 taking number num1 from keyboard
     * @param num2 taking number num2 from keyboard
     * @param base taking base of num1 and num2 from keyboard
     * @return just simply return result
     */
    private static int anyBaseMultiplication(int num1, int num2, int base) {

        int result = 0;
        int power = 1;
        while (num2 > 0 ) {

            // Find the last digit of num2:
            int digit = num2 % BASE;

            // Multiply (last digit of num2) * (num1):
            int sProd = getProductWithSignalDigit(base, num1, digit);

            // Now simply addition of result with sProd and sProd 1 digit need to be shifted towards right side:
            result = anyBaseAddition(result, sProd*power, base);

            // now num2 need to smaller:
            num2 /= BASE;

            // power increment by double:
            power *= BASE;

        }

        // just simply return result:
        return result;
    }




    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        // take base from user:
        int base = scan.nextInt();

        // take num1Base from user:
        int num1Base = scan.nextInt();

        // take num2Base from user:
        int num2Base = scan.nextInt();

        int result = anyBaseMultiplication(num1Base, num2Base, base);
        System.out.println("Given ( " + num1Base + " * " + num2Base + " ) of base " + base + " = " + result);
    }
}
