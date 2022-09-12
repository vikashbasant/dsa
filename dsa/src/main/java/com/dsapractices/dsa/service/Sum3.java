package com.dsapractices.dsa.service;

import java.util.*;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k = j+1; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        ans.add(Arrays.asList(nums[i],nums[j], nums[k]));
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }


    public List<List<Integer>> threeSumBetter(int[] nums) {

        Set<List<Integer>> ans = new HashSet<>();
        if(nums.length == 0) return new ArrayList<>(ans);
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                if(nums[j]+nums[k] == -nums[i]){
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }else if(nums[j]+nums[k] > -nums[i]){
                    k--;
                }else{
                    j++;
                }
            }

        }
        return new ArrayList<>(ans);
    }

    // timeComplexity: O(n^2)
    // spaceComplexity: O(n)
    public List<List<Integer>> threeSumBetterAnother(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length-2; i++) {

            if(num[i] > 0) break;

            if (i > 0 && num[i] == num[i-1]) continue;

            int lo = i+1, hi = num.length-1, sum = 0 - num[i];
            while (lo < hi) {
                if (num[lo] + num[hi] == sum) {
                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
                    lo++; hi--;

                    // improve: skip duplicates
                    while (lo < hi && num[lo] == num[lo+1]) lo++;

                    // improve: skip duplicates
                    while (lo < hi && num[hi] == num[hi-1]) hi--;

                } else if (num[lo] + num[hi] < sum){
                    lo++;
                }
                else{

                    hi--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        Sum3 obj = new Sum3();
        List<List<Integer>> result = obj.threeSumBetterAnother(nums);
        for(List ele: result){
            for(Object e: ele){
                System.out.print(e+" ");
            }
            System.out.println();
        }

    }
}
