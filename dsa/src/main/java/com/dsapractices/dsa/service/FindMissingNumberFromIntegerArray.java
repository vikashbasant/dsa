package com.dsapractices.dsa.service;

import java.util.Scanner;

public class FindMissingNumberFromIntegerArray {
    /**
     * timeComplexity: O(N)
     * spaceComplexity: O(1)
     * @param arr
     * @return
     */
    public static int findMissingNumber(int[] arr){
        int n = arr.length;
        int sum = (n*(n+1))/2;
        int actualSum = 0;
        for(int ele: arr){
            actualSum+=ele;
        }
        return sum-actualSum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for(int i=1; i<n; i++){
            arr[i-1] = scan.nextInt();
        }
        int result = findMissingNumber(arr);
        System.out.println(result);
    }
}
