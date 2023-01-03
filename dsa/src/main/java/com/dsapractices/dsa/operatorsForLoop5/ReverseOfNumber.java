package com.dsapractices.dsa.operatorsForLoop5;

import java.util.Scanner;

public class ReverseOfNumber {

    /**
     * Return the reverse of number:
     * @param num
     * @return
     */
    private static int reverseOfNumber(int num){
        int temp = num;
        int reverseNum = 0;
        while(temp>0){
            reverseNum = reverseNum * 10 + temp%10;
            temp/=10;
        }
        return reverseNum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = reverseOfNumber(num);
        System.out.println(" Reverse of Number " + num + " = " + result);
    }
}
