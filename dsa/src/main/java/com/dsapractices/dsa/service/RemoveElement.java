package com.dsapractices.dsa.service;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /**
     * timeComplexity: O(N)
     * spaceComplexity: O(1)
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            if(nums[j] == val){
                j--;
            }else if(nums[i] != val){
                i++;
            }else{
                swap(nums, i++, j--);
            }
        }
        return j+1;
    }


    public static int removeElementAnother(int[] nums, int val) {
        int begin = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[begin] = nums[i];
                begin++;
            }
        }
        return begin;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = scan.nextInt();
        }
        int val = scan.nextInt();
        int result = removeElementAnother(nums, val);
        Arrays.sort(nums, 0, result);
        for(int i=0; i<result; i++){
            System.out.print(nums[i] + " ");
        }


    }
}
