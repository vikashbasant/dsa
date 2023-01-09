package com.dsapractices.dsa.pepcoding.basicConcept;

import java.util.Scanner;

public class PrintReverseNumber {

    /**
     * Print the reverse the number:
     * TimeComplexity: O(log(n))
     * SpaceComplexity: O(1)
     * @param num
     */
    private static void reverseNumberPrint(int num){
        while(num>0){
            int rem = num%10;
            System.out.println(rem);
            num/=10;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        reverseNumberPrint(num);
    }
}
