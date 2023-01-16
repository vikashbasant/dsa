package com.dsapractices.dsa.pepcoding.numberSystem;

import java.util.Scanner;

public class FindPermotationNo {

    /**
     * Find Factorial of number:
     * TimeComplexity: O(num)
     * SpaceComplexity: O(1)
     * @param num
     * @return
     */
    private static int fact(int num) {
        int fValue = 1;
        for (int i = 1; i <= num; i++) {
            fValue*=i;
        }
        return fValue;
    }
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int r = scan.nextInt();

        // Find NpR:
        int result = fact(p)/fact(p-r);

        System.out.println("result = " + result);
    }
}
