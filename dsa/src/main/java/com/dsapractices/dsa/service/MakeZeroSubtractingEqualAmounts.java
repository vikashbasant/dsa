package com.dsapractices.dsa.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MakeZeroSubtractingEqualAmounts {
    /*
    Observation
        Same elements, are always same
            -> Deduplicate

        Different elements, are always different until 0
            -> Counts unique

    TimeComplexity: O(N)
    SpaceComplexity: O(N)
     */
    public static int minimumOperationsBetter(int[] nums){
        Set<Integer> unique = new HashSet<Integer>();
        for(int ele: nums){
            if(ele != 0){
                unique.add(ele);
            }
        }
        return unique.size();
    }

    /*
        timeComplexity: O(N^2)
        spaceComplexity: O(1)
    */
    public static int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                count++;
                for(int j=i; j<nums.length; j++){
                    nums[j] -= temp;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int result = minimumOperations(arr);
        System.out.println(result);
    }
}
