package com.dsapractices.dsa.pepcoding.numberSystem;

import java.util.Scanner;

public class AnyBaseSubtraction {

    private static final int BASE = 10;

    /**
     * Any Base Subtraction:
     * TimeComplexity: O(Log(num2)) where (num2 >= num1)
     * SpaceComplexity: O(1)
     *
     * @param num1 taking number num1 from keyboard
     * @param num2 taking number num2 from keyboard
     * @param base taking base of num1 and num2 from keyboard
     * @return
     */
    private static int anyBaseSubtraction (int num1, int num2, int base) {

        int carry = 0;
        int result = 0;
        int power = 1;

        // Loop is running till bigger number > 0:
        while (num2 > 0) {

            // get last digit of num1;
            int rem1 = num1 % BASE;
            // get smaller number num1:
            num1 /= BASE;


            // get last digit of num2:
            int rem2 = num2 % BASE;
            // get smaller number num2:
            num2 /= BASE;


            // add rem2 + carry:
            rem2 = rem2 + carry;

            // Now check rem2 >= rem1:
            if (rem2 >= rem1) {
                // then carry assign to 0:
                carry = 0;
                // Now subtract (rem2 - rem1) * Math.pow(10,0) into result, where every time power is increase every
                // time:
                result += (rem2 - rem1) * power;
            } else {
                // rem2 < rem1:

                // then carry assign to -1:
                carry = -1;

                // Now add base to rem2:
                rem2 += base;

                // Now subtract (rem2 - rem1) * Math.pow(10,0) into result, where every time power is increase every
                // time:
                result += (rem2 - rem1) * power;
            }

            // increment the power by double:
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

        int result = anyBaseSubtraction(num1Base, num2Base, base);
        System.out.println("Given ( " + num1Base + " - " + num2Base + " ) of base " + base + " = " + result);
    }
}
