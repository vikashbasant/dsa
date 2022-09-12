package com.dsapractices.dsa.service;

import java.util.*;

public class MergeSimilarItem {

    // TimeComplexity: O(nlogn)
    // SpaceComplexity: O(items1.length || items2.length)
    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Arrays.sort(items1, (a, b) -> a[0]-b[0]);
        Arrays.sort(items2, (a, b) -> a[0]-b[0]);
        List<List<Integer>> result = new ArrayList<>();
        int n = items1.length;
        int m = items2.length;
        int i=0, j=0, k=0;

        while(i<n && j<m){
            if(items1[i][0] == items2[j][0]){
                List<Integer> ans= new ArrayList<>();
                ans.add(items1[i][0]);
                ans.add(items1[i][1]+items2[j][1]);
                i++;
                j++;
                result.add(ans);
            }else if(items1[i][0] > items2[j][0]){
                List<Integer> ans= new ArrayList<>();
                ans.add(items2[j][0]);
                ans.add(items2[j][1]);
                j++;
                result.add(ans);
            }else{
                List<Integer> ans= new ArrayList<>();
                ans.add(items1[i][0]);
                ans.add(items1[i][1]);
                i++;
                result.add(ans);
            }
        }

        while(i<n){
            List<Integer> ans= new ArrayList<>();
            ans.add(items1[i][0]);
            ans.add(items1[i][1]);
            i++;
            result.add(ans);
        }

        while(j<m){
            List<Integer> ans= new ArrayList<>();
            ans.add(items2[j][0]);
            ans.add(items2[j][1]);
            j++;
            result.add(ans);
        }

        return result;

    }


    public static List<List<Integer>> mergeSimilarItemsHashMap(int[][] items1, int[][] items2){
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for(int[] item : items1){
            map.put(item[0], map.getOrDefault(item[0], 0)+item[1]);
        }

        for(int[] item : items2){
            map.put(item[0], map.getOrDefault(item[0], 0)+item[1]);
        }


        for (Map.Entry<Integer, Integer> mapElement : map.entrySet()) {
            List<Integer> internal = new ArrayList<>();
            internal.add(mapElement.getKey());
            internal.add(mapElement.getValue());
            result.add(internal);
        }
        return result;
    }
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] item1 = new int[n][];
        for(int i=0; i<n; i++){
            int m = scan.nextInt();
            int[] internal = new int[m];
            for(int j=0; j<m; j++){
                internal[j] = scan.nextInt();
            }
            item1[i] = internal;
        }

        int n1 = scan.nextInt();
        int[][] item2 = new int[n1][];
        for(int i=0; i<n1; i++) {
            int m = scan.nextInt();
            int[] internal = new int[m];
            for (int j = 0; j < m; j++) {
                internal[j] = scan.nextInt();
            }
            item2[i] = internal;
        }

        List<List<Integer>> result = mergeSimilarItemsHashMap(item1, item2);
        for(List ele: result){
            for(Object x: ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }



    }
}
