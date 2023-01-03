package com.dsapractices.dsa.pepcoding;

import java.util.Scanner;

public class FindGCDAndLCM {

    /**
     * Find the GCD of the 2 number:
     * TimeComplexity: O(logN)
     * SpaceComplexity: O(1)
     * @param num1
     * @param num2
     * @return
     */
    private static int gcdHelper(int num1, int num2){
        // Base Case: If the remainder is 0 then return divisor:
        if(num1 == 0){
            return num2;
        }

        // Induction Step & Induction Hypothesis: until remainder is 0:
        return gcdHelper(num2%num1, num1);
    }

    private static int gcd(int num1, int num2){
        return gcdHelper(Math.min(num1, num2), Math.max(num1, num2));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        int gcd = gcd(num1, num2);
        int lcm = (num1*num2)/gcd;
        System.out.println("GCD of " + num1 + " and " + num2 + " = " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);
    }
}
