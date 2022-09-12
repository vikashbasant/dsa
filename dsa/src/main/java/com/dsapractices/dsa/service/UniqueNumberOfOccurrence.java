package com.dsapractices.dsa.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class UniqueNumberOfOccurrence {

    /*
    timeComplexity: O(N)
    spaceComplexity: O(N)
     */
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int ele: arr){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }
        Map<Integer, Integer> values = new HashMap<Integer, Integer>();
        for(int ele: map.values()){
            int freq = values.getOrDefault(ele, 0);
            if(freq == 0){
                values.put(ele, freq+1);
            }else{
                return false;
            }
        }
        return true;
    }

    /*
    Assumption:
        1: Count the occurrences of each char.
        2: Compare if the numbers of distinct chars and distinct counts are equal.
    timeComplexity: O(N)
    spaceComplexity: O(N)
     */
    public static boolean uniqueOccurrencesBetter(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int ele: arr){
            map.put(ele, map.getOrDefault(ele, 0)+1);
        }
        return map.size() == new HashSet<Integer>(map.values()).size();
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        boolean result = uniqueOccurrencesBetter(arr);
        System.out.println(result);
    }
}
