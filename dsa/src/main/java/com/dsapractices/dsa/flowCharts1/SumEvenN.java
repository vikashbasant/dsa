package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;

public class SumEvenN {

    /**
     * Sum of all even number from 1 to N (inclusive):
     * @param num
     * @return
     */
    private static int sumOfAllEvenN(int num){
        int total = 0;
        for(int i=1; i<=num; i++){
            total+= (i%2 == 0) ? i : 0;
        }
        return total;
    }

    private static int sumOfAllEvenNRec(int num){
        // Base Case:
        if(num == 0){
            return 0;
        }

        // Induction Hypothesis:
        int smallResult = sumOfAllEvenNRec(num-1);

        // Induction Step:
        int finalResult = 0;
        if(num%2 == 0){
            finalResult += num;
        }
        finalResult+= smallResult;

        return finalResult;
    }

    private static int sumOfAllEvenBetter(int num){
        // Base Case:
        if(num == 0){
            return num;
        }

        // Induction Step:
        if(num%2 == 0){
            // Induction Hypothesis:
            return num+sumOfAllEvenBetter(num-1);
        }else{
            // Induction Hypothesis:
            return sumOfAllEvenBetter(num-1);
        }

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sumOfEven = sumOfAllEvenBetter(num);
        System.out.println("sumOfEven = " + sumOfEven);
    }
}
