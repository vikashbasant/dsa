package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;

public class LargestOfNumber {

    /**
     * largest of 3 number and return the largest number:
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    private static int largestNumber(int num1, int num2, int num3){

        int lNumber = Integer.MIN_VALUE;
        if(num1>=num2 && num1>=num3){
            lNumber = num1;
        }else if(num2>=num1 && num2>=num3){
            lNumber = num2;
        }else{
            lNumber = num3;
        }
        return lNumber;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int largestNumber = largestNumber(num1, num2, num3);
        System.out.println("largestNumber = " + largestNumber);
    }
}
