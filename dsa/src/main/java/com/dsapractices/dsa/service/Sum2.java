package com.dsapractices.dsa.service;

import java.util.*;

public class Sum2 {
    public static List<List<Integer>> pairSum(int[] nums){
        Set<List<Integer>> ans = new HashSet<>();
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            if(nums[i]+nums[j] == 0){
                ans.add(Arrays.asList(nums[i], nums[j]));
                i++;
                j--;
            }else if(nums[i]+nums[j] > 0){
                j--;
            }else{
                i++;
            }
        }
        return new ArrayList<>(ans);
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        List<List<Integer>> result = pairSum(nums);
        for(List ele: result){
            for(Object e: ele){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
