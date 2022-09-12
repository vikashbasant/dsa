package com.dsapractices.dsa.service;

import java.util.*;

public class IntersectionOfTwoArrays {

    /**
     * timeComplexity: O(N)
     * spaceComplexity: O(N)
     * @param nums1
     * @param nums2
     * @return
     */

    public static int[] intersectionBrute(int[] nums1, int[] nums2){
        Set<Integer> set = new HashSet<>();
        int result[] = new int[1000];
        for(int ele: nums1){
            result[ele] += 1;
        }

        for(int ele: nums2){
            if(result[ele] != 0){
                set.add(ele);
                result[ele]-=1;
            }
        }

        int[] ans = new int[set.size()];
        int i = 0;
        for(int ele: set){
            ans[i++] = ele;
        }
        return ans;
    }
//:====================================================================================================://
    /**
     * timeComplexity: O(N)
     * spaceComplexity: O(N)
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele: nums1){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }

        for(int ele: nums2){
            int freq = map.getOrDefault(ele,0);
            if(freq != 0){
                result.add(ele);
                map.put(ele, 0);
            }
        }
        int[] ans = new int[result.size()];
        int i = 0;
        for(int ele: result){
            ans[i++] =  ele;
        }
        return ans;
    }
//=====================================================================================================//
    /**
     * timeComplexity: O(N*logN)
     * spaceComplexity: O(N)
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersectionUsingAnotherMethod(int[] nums1, int[] nums2){
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for(int ele: nums1){
            if(binarySearch(nums2, ele)){
                set.add(ele);
            }
        }

        int[] result = new int[set.size()];
        int i = 0;
        for(int ele: set){
            result[i++] = ele;
        }
        return result;
    }

    /**
     * timeComplexity: O(logN)
     * spaceComplexity: O(1)
     * @param arr
     * @param target
     * @return
     */
    private static boolean binarySearch(int[] arr, int target){
        int i = 0;
        int j = arr.length;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] == target){
                return true;
            }else if(arr[mid] > target){
                j = mid-1;
            }else{
                i = mid+1;
            }

        }
        return false;
    }

//=======================================================================================================//

    /**
     * timeComplexity: O(N*log N)
     * spaceComplexity: O(N)
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersectionAnotherApproach(int[] nums1, int[] nums2){
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                set.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] ans = new int[set.size()];
        int k = 0;
        for(int ele: set){
            ans[k++] = ele;
        }
        return ans;

    }

//========================================================================================================//

    /**
     * timeComplexity: O(N)
     * spaceComplexity: O(N)
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersectionBest(int[] nums1, int nums2[]){
        Set<Integer> intermediateSet = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for(int ele: nums1){
            intermediateSet.add(ele);
        }

        for(int ele: nums2){
            if(intermediateSet.contains(ele)){
                resultSet.add(ele);
            }
        }

        int[] ans = new int[resultSet.size()];
        int i = 0;
        for(int ele: resultSet){
            ans[i++] = ele;
        }
        return ans;


    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums1 = new int[n];
        for(int i=0; i<n; i++){
            nums1[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int[] nums2 = new int[m];
        for(int i=0; i<m; i++){
            nums2[i] = scan.nextInt();
        }

        int[] result = intersectionAnotherApproach(nums1, nums2);
        for(int ele: result){
            System.out.print(ele+" ");
        }

    }
}
