package com.dsapractices.dsa.pepcoding.numberSystem;

import java.util.Scanner;

public class AnyBaseToDecimal {

    private static final int TO_BASE = 10;

    /**
     * Any Base to Decimal Number conversion:
     * TimeComplexity : O(Log(number) base (toBase))
     * SpaceComplexity : O(1)
     * @param number : Given Number
     * @param fromBase : Given Number of Base i.e fromBase
     * @return : Simply return the converted Number
     */
    public static int anyBaseToDecimal (int number, int fromBase) {

        int rValue = 0;
        int power = 1;
        while (number > 0) {
            // get the remainder:
            int rem = number % TO_BASE;

            // calculate the value resultValue for each digit:
            rValue +=  rem * power;

            // just small the number:
            number/=TO_BASE;

            // just double the power fo fromBase:
            power*=fromBase;
        }
        return rValue;
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int baseOfNum = scan.nextInt();

        int result = anyBaseToDecimal(number, baseOfNum);
        System.out.println("Given " + number + " of base " + baseOfNum + " converted into Decimal Number = " + result);
    }
}
