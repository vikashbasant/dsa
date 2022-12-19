package com.dsapractices.dsa.conditionalsAndLoops2;

import java.util.Scanner;

public class SumEvenOddDigit {

    /**
     * Sum of even digit and sum of odd digit:
     * @param num
     */
    private static void sumOfEvenOdd(int num){
        int eSum = 0;
        int oSum = 0;
        while(num > 0){
            int rem = num%10;
            if(rem % 2 == 0){
                eSum+=rem;
            }else{
                oSum+=rem;
            }
            num/=10;
        }
        System.out.println("Sum of Even Digit = " + eSum + " Sum of odd Digit = " + oSum);
    }

    private static void sumOfEvenOddRecHelper(int num, int eSum, int oSum){
        // Base Case:
        if(num <= 0){
            System.out.println("Sum of Even Digit = " + eSum + " Sum of odd Digit = " + oSum);
            return;
        }

        // Induction Step:
        int rem = num%10;
        if(rem % 2 == 0){
            eSum+=rem;
        }else{
            oSum+=rem;
        }

        // Induction Hypothesis:
        sumOfEvenOddRecHelper(num/10, eSum, oSum);
    }
    private static void sumOfEvenOddRec(int num){
        sumOfEvenOddRecHelper(num, 0, 0);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        sumOfEvenOddRec(num);
    }
}
