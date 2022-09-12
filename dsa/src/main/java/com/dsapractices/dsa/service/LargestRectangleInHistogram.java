package com.dsapractices.dsa.service;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleInHistogram {
    /**
     * timeComplexity: O(N*N)
     * spaceComplexity: O(1)
     * @param heights
     * @return
     */
    public static int largestRectangleArea(int[] heights) {
        int maximumArea = Integer.MIN_VALUE;
        for(int i=0; i<heights.length; i++){

            // left smallest bar from i:
            int j=i-1;
            while(j>=0){
                if(heights[j] < heights[i]){
                    break;
                }
                j--;
            }

            // right smallest bar from i:
            int k = i+1;
            while(k<heights.length){
                if(heights[k] < heights[i]){
                    break;
                }
                k++;
            }

            // calculate the area:
            int area = ((k-1)-(j+1)+1)*heights[i];
            maximumArea = Math.max(area, maximumArea);
        }
        return maximumArea;
    }

    /**
     * timeComplexity: O(N)
     * spaceComplexity: O(N)
     * @param heights
     * @return
     */
    public static int largestRectangleAreaBetter(int[] heights){
        int n = heights.length;
        Stack<Integer> stackIndex = new Stack<>();

        int[] leftSmallest = new int[n];
        for(int i=0; i<n; i++){
            while(!stackIndex.isEmpty() && heights[stackIndex.peek()] >= heights[i]){
                stackIndex.pop();
            }

            if(stackIndex.isEmpty()){
                leftSmallest[i] = 0;
            }else{
                leftSmallest[i] = stackIndex.peek()+1;
            }
            stackIndex.push(i);
        }

        // clear the stack to be re-used:
        while(!stackIndex.isEmpty()){ stackIndex.pop();}

        int[] rightSmallest = new int[n];
        for(int i=n-1; i>=0; i--){
            while(!stackIndex.isEmpty() && heights[stackIndex.peek()] >= heights[i]){
                stackIndex.pop();
            }

            if(stackIndex.isEmpty()){
                rightSmallest[i] = n-1;
            }else{
                rightSmallest[i] = stackIndex.peek()-1;
            }

            stackIndex.push(i);

        }

        int maxArea = 0;
        for(int i=0; i<n; i++){
            maxArea = Math.max(maxArea, heights[i]*(rightSmallest[i]-leftSmallest[i]+1));
        }
        return maxArea;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int maximumLargestArea = largestRectangleAreaBetter(arr);
        System.out.println(maximumLargestArea);
    }
}
