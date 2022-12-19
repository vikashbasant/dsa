package com.dsapractices.dsa.conditionalsAndLoops2;

import java.util.Scanner;

public class SumOfN {

    /**
     * Find the sum of N natural number:
     * @param num
     * @return
     */
    private static int sumN(int num){
        int sum = 0;
        for(int i=0; i<=num; i++){
            sum+=i;
        }
        return sum;
    }

    private static int sumNRec(int num){
        // Base Case:
        if(num == 0){
            return 0;
        }

        // Induction Hypothesis:
        int smallResult = sumNRec(num-1);

        // Induction Step:
        int finalResult = num + smallResult;
        return finalResult;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = sumNRec(num);
        System.out.println(result);
    }
}
