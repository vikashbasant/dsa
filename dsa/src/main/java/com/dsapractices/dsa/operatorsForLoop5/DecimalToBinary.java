package com.dsapractices.dsa.operatorsForLoop5;

import java.util.Scanner;

public class DecimalToBinary {

    /**
     * Decimal To Binary conversion:
     * @param num
     * @return
     */
    private static long decimalToBinary(int num){
        long binary = 0, pow = 1;
        while(num > 0){
            int lastBit = num%2;
            binary += lastBit * pow;
            pow *= 10;
            num/=2;
        }
        return binary;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        long result = decimalToBinary(num);
        System.out.println(result);
    }
}
