package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;

public class FindProduct {

    /**
     * Find Factorial of Number and return:
     * @param num
     * @return
     */
    private static int factorialN(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact*=i;
        }
        return fact;
    }

    private static int factRecursion(int num){
        if(num == 1){
            return 1;
        }
        int smallResult = factRecursion(num-1);
        int finalResult = num * smallResult;
        return finalResult;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int factorialOfNum = factRecursion(num);
        System.out.println("factorialOfNum = " + factorialOfNum);
    }
}
