package com.dsapractices.dsa.service;

import java.util.Scanner;

public class SortArrayByParityII {
    private static void swap(int[] nums, int n, int m){
        int temp = nums[n];
        nums[n] = nums[m];
        nums[m] = temp;
    }

    /**
     * timeComplexity: O(N)
     * spaceComplexity: O(1)
     * @param nums
     * @return
     */
    public static int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int i=0, j=1;
        while(i<n && j<n){
            if(nums[i]%2==0){
                i+=2;
            }else if(nums[j]%2!=0){
                j+=2;
            }else{
                swap(nums, i, j);
            }
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int[] result = sortArrayByParityII(arr);
        for(int ele: result){
            System.out.print(ele+" ");
        }
    }
}
