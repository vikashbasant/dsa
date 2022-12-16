package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;

public class AverageOfThreeNumber {

    /**
     * Average of three number and return the average:
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    private static int averageOfNumber(int num1, int num2, int num3){
        int totalSum = (num1+num2+num3);
        return totalSum/3;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;

        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        int averageOfThreeNumber = averageOfNumber(num1, num2, num3);
        System.out.println("averageOfThreeNumber = " + averageOfThreeNumber);
    }
}
