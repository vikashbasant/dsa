package com.dsapractices.dsa.pepcoding.numberSystem;

import java.util.Scanner;

public class DecimalToAnyBase {

    private static final int FROM_BASE = 10;

    // जिस base में convert करना है  number  को  उस base से divide करे number मै  तबतक number > 0 हो |
    /**
     * Decimal number to Any Base number convertor:
     * TimeComplexity: O(log(toBase)decimalNum)
     * SpaceComplexity: O(1)
     *
     * @param decimalNum
     * @param toBase
     * @return
     */
    public static int decimalToAnyBase (int decimalNum, int toBase) {
        String rValue = "";
        while (decimalNum > 0) {

            int rem = decimalNum % toBase;
            rValue = rem + rValue;

            int quo = decimalNum / toBase;
            decimalNum = quo;
        }
        return Integer.parseInt(rValue);
    }


    // जिस base में convert करना है  number  को  उस base से divide करे number मै  तबतक number > 0 हो |
    /**
     * Decimal number to Any Base number convertor:
     * TimeComplexity: O(log(toBase)decimalNum)
     * SpaceComplexity: O(1)
     *
     * @param decimalNum
     * @param toBase
     * @return
     */
    public static int decimalToAnyBaseBySir (int decimalNum, int toBase) {

        int power = 1; // Math.pow(10,0) == 1
        int rValue = 0;

        while (decimalNum > 0) {
            // For getting rem putting right side:
            int rem = decimalNum % toBase;

            // returnValue:
            rValue += (rem* power);

            // now number became smaller:
            int quo = decimalNum / toBase;
            decimalNum = quo;

            // now power is increment by 10:
            power *=FROM_BASE;

        }

        // now simply return:
        return rValue;
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        // Decimal number:
        int decimalNum = scan.nextInt();

        // Target Base:
        int toBase = scan.nextInt();

        int result = decimalToAnyBaseBySir(decimalNum, toBase);
        System.out.println(decimalNum + " base 10 to base " + toBase + " conversion = " + result);
    }
}
