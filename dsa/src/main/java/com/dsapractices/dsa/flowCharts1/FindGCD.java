package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;

public class FindGCD {

    /**
     * Find the gcd of the number, and return
     * @param num1
     * @param num2
     * @return
     */

    private static int gcdHelper(int num1, int num2){
        if(num1 == 0){
            return num2;
        }
        return gcdHelper(num2%num1, num1);
    }

    private static int gcd(int num1, int num2){
        return gcdHelper(Math.min(num1, num2), Math.max(num1, num2));
    }

    /**
     * Find the lcm of number and return:
     * @param num1
     * @param num2
     * @return
     */
    private static int lcm(int num1, int num2){
        int gcd = gcd(num1, num2);

        int result = (num1*num2)/gcd;
        return result;
    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int gcdOfNum = gcd(num1, num2);
        System.out.println("gcdOfNum = " + gcdOfNum);

        int lcm = lcm(num1, num2);
        System.out.println("lcm = " + lcm);
    }
}
