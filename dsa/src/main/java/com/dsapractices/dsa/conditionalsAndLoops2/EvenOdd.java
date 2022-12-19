package com.dsapractices.dsa.conditionalsAndLoops2;

import java.util.Scanner;

public class EvenOdd {

    /**
     * Check weather number is even or odd:
     * @param num
     */
    private static void isEvenOdd(int num){
        if(num%2 == 0){
            System.out.println("Number is Even:");
        }else{
            System.out.println("Number is Odd");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isEvenOdd(num);
    }
}
