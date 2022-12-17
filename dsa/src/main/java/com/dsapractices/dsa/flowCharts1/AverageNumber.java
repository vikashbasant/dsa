package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;

public class AverageNumber {

    /**
     * Average of three number:
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    private static int averageNo(int num1, int num2, int num3){
        return (num1+num2+num3)/3;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int averageNo = averageNo(num1, num2, num3);
        System.out.println("averageNo = " + averageNo);
    }
}
