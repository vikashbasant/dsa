package com.dsapractices.dsa.service;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits {

    /**
     * timeComplexity: O(NlogN)
     * spaceComplexity: O(1)
     * @param num
     * @return
     */
    public static int minimumSumStraightForward(int num) {
        int[] arr = new int[4];
        int k = 0;
        while(num>0){
            arr[k++] = num%10;
            num/=10;
        }

        Arrays.sort(arr);
        int num1 = arr[0]*10+arr[2];
        int num2 = arr[1]*10+arr[3];
        return num1+num2;
    }
    /**
     * timeComplexity: O(NlogN)
     * spaceComplexity: (1)
     * @param num
     * @return
     */
    public static int minimumSum(int num) {
        char[] chars = (num+"").toCharArray();
        Arrays.sort(chars);
        int num1 = Integer.parseInt(""+chars[0]+chars[2]);
        int num2 = Integer.parseInt(""+chars[1]+chars[3]);
        return num1+num2;
    }
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int result = minimumSumStraightForward(num);
        System.out.println(result);
    }
}
