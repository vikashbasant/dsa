package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;

public class CheckNumber {

    /**
     * Check the number is positive, negative and zero simply print it:
     * @param num
     */
    private static void numberCheck(int num){
        if(num > 0){
            System.out.println("The number " + num +" is positive.");
        }else if(num < 0){
            System.out.println("The number " + num + " is negative.");
        }else{
            System.out.println("The number " + num + " is zero.");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        numberCheck(num);
    }
}
