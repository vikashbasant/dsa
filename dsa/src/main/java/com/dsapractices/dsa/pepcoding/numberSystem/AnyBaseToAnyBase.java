package com.dsapractices.dsa.pepcoding.numberSystem;

import java.util.Scanner;

public class AnyBaseToAnyBase {

    /**
     * Any Base to Any Base Number conversion:
     *
     * Logic:
     *  1. From AnyBase to Decimal
     *  2. Decimal to TargetBase
     *
     * TimeComplexity : O(Log(number) base (toBase))
     * SpaceComplexity : O(1)
     * @param number : Given Number
     * @param fromBase : Given Number of Base i.e fromBase
     * @param toBase : Given Number Converted into toBase
     * @return : Simply return the converted Number
     */
    private static int anyBaseToAnyBase (int number, int fromBase, int toBase) {

        // AnyBase To Decimal conversion:
        int anyBaseToDecimal = AnyBaseToDecimal.anyBaseToDecimal(number, fromBase);

        // Decimal To AnyBase conversion:
        int decimalToAnyBase = DecimalToAnyBase.decimalToAnyBaseBySir(anyBaseToDecimal, toBase);

        // simply just return the value:
        return decimalToAnyBase;
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int fromBase = scan.nextInt();
        int toBase = scan.nextInt();
        int result = anyBaseToAnyBase(number, fromBase, toBase);
        System.out.println("Given number " + number + " of base " + fromBase + " converted into base " + toBase + " = "
                + result);
    }
}
