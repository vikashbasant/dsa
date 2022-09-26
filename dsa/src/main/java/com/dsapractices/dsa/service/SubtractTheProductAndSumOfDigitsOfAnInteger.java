package com.dsapractices.dsa.service;

import java.util.Scanner;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    /**
     * timeComplexity: O(1)
     * spaceComplexity: O(1)
     * @param n
     * @return
     */
    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            mul*=rem;
            n/=10;
        }
        return mul-sum;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = subtractProductAndSum(n);
        System.out.println(result);

    }
}
