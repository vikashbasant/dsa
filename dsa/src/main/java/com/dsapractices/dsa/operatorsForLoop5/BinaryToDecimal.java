package com.dsapractices.dsa.operatorsForLoop5;

import java.util.Scanner;

public class BinaryToDecimal {

    /**
     * Binary to Decimal Conversion:
     * @param num
     * @return
     */
    private static int binaryToDecimal(int num){
        int decimal = 0;
        int power = 0;
        while(num > 0){
            int rem = num%10;
            decimal+= rem*Math.pow(2, power++);
            num/=10;
        }
        return decimal;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = binaryToDecimal(num);
        System.out.println(result);
    }
}
