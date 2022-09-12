package com.dsapractices.dsa.service;

import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays {
    public int[] mergeSortedArray(int[] nums1, int[] nums2, int n , int m){
        int[] ans = new int[n+m];
        int i=0, j=0, k=0;
        while(i<n && j<m){
            if(nums1[i] <= nums2[j]){
                ans[k++] = nums1[i++];
            }else{
                ans[k++] = nums2[j++];
            }
        }
        while(i<n){
            ans[k++] = nums1[i++];
        }
        while(j<m){
            ans[k++] = nums2[j++];
        }
        return ans;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;
        int[] ans = mergeSortedArray(nums1, nums2, n, m);
        System.out.println(Arrays.toString(ans));
        int len = ans.length;
        double result;
        if(len%2==0){
            int index = (len/2);
            int index1 = index+1;
            result = (ans[index-1]+ans[index1-1])/2d;
        }else{
            int index = (len+1)/2;
            result = ans[index-1];
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums1= {1,2};
        int[] nums2= {3,4};
        Median_of_Two_Sorted_Arrays obj = new Median_of_Two_Sorted_Arrays();
        double medianSortedArrays = obj.findMedianSortedArrays(nums1, nums2);
        System.out.println(medianSortedArrays);

    }
}
