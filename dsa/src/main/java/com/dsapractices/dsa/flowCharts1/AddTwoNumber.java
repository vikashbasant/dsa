package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;


public class AddTwoNumber {

    /**
     * add two number and return that total sum
     * @param num1
     * @param num2
     * @return
     */
    private static int add(int num1, int num2){
        int total = num1+num2;
        return total;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int totalSum = add(num1, num2);
        System.out.println("totalSum = " + totalSum);
    }
}
