package com.dsapractices.dsa.pepcoding.numberSystem;

import java.util.Scanner;

public class AnyBaseAddition {

    private static final int BASE = 10;

    /**
     * Any Base Addition:
     * TimeComplexity: O(Log(num)) where (num1 == num2 == num)
     * SpaceComplexity: O(1)
     * @param num1 taking number num1 from keyboard
     * @param num2 taking number num2 from keyboard
     * @param base taking base of num1 and num2 from keyboard
     * @return
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
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        // take base from user:
        int base = scan.nextInt();

        // take num1Base from user:
        int num1Base = scan.nextInt();

        // take num2Base from user:
        int num2Base = scan.nextInt();

        int result = anyBaseAddition(num1Base, num2Base, base);
        System.out.println("Given ( " + num1Base + " + " + num2Base + " ) of base " + base + " = " + result);
    }
}
