package com.dsapractices.dsa.service;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    private static int findIndex(int[] nums2, int ele){
        for(int i=0; i<nums2.length; i++){
            if(ele == nums2[i]){
                return i;
            }
        }
        return -1;
    }
    private static int nextGreaterHelper(int nums2[], int ele, int index){
        for(int i= index; i<nums2.length; i++){
            if(ele < nums2[i]){
                return nums2[i];
            }
        }
        return -1;
    }

    /**
     * timeComplexity: O(N^2)
     * spaceComplexity: O(N)
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        for(int i=0;  i<nums1.length; i++){
            int index = findIndex(nums2, nums1[i]);
            int nextGreater = nextGreaterHelper(nums2, nums1[i], index+1);
            ans[i] = nextGreater;
        }
        return ans;
    }


    //:===========================Another Approach:=============================================//

    /**
     * timeComplexity: O(N^2)
     * spaceComplexity: O(N)
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] nextGreaterElementBrute(int[] nums1, int[] nums2){
        int[] ans = new int[nums1.length];

        for(int i=0; i<nums1.length; i++){
            int greaterElement = -1, j = nums2.length-1;
            while(j>=0 && nums2[j] != nums1[i]){
                if(nums2[j] > nums1[i]){
                    greaterElement = nums2[j];
                }
                j--;
            }
            ans[i] = greaterElement;
        }
        return ans;
    }

    // :==================================Another Approach:==========================================//

    /**
     * timeComplexity: O(N)
     * spaceComplexity: O(N)
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] nextGreaterElementOptimal(int[] nums1, int[] nums2){
        int[] ans = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        // map from x to next greater element of x:
        HashMap<Integer, Integer> map = new HashMap<>();

        // find out all the next greater element in nums2 array:
        for(int num: nums2){
            /* if num is greater than top element in stack then it is the next greater next for top element in the
            stack: */
            while(!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(), num);
            }
            // then add num to stack:
            stack.add(num);
        }

        // traverse the nums1 array and check the value into map:
        int i = 0;
        for(int num : nums1){
            ans[i++]= map.getOrDefault(num, -1);
        }
        return ans;
    }


    // :==================================Another Approach:==========================================//

    /**
     * timeComplexity: O(N)
     * spaceComplexity: O(1)
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] nextGreaterElementOptimalBetter(int[] nums1, int[] nums2){

        Stack<Integer> stack = new Stack<>();
        // map from x to next greater element of x:
        HashMap<Integer, Integer> map = new HashMap<>();

        // find out all the next greater element in nums2 array:
        for(int num: nums2){
            /* if num is greater than top element in stack then it is the next greater next for top element in the
            stack: */
            while(!stack.isEmpty() && stack.peek() < num){
                map.put(stack.pop(), num);
            }
            // then add num to stack:
            stack.add(num);
        }

        // traverse the nums1 array and check the value into map:
        for(int i=0; i<nums1.length; i++){
            nums1[i]= map.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num1 = new int[n];
        for(int i=0; i<n; i++){
            num1[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] num2 = new int[m];
        for(int i=0; i<m; i++){
            num2[i] = scan.nextInt();
        }

        int[] result = nextGreaterElementOptimalBetter(num1, num2);
        for(int ele: result){
            System.out.print(ele+ " ");
        }
    }
}
