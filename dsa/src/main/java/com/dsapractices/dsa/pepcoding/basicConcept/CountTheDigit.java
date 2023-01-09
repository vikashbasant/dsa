package com.dsapractices.dsa.pepcoding.basicConcept;

import java.util.Scanner;

public class CountTheDigit {

    /**
     * Count the digit of number:
     * TimeComplexity: O(log(num))
     * SpaceComplexity: O(1)
     * @param num
     * @return
     */
    private static int countDigit(int num){
        int count = 0;
        // Loop traverse until num become 0:
        while(num > 0){
            count++;
            num/=10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = countDigit(num);
        System.out.println(result);
    }
}
