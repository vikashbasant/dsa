package com.dsapractices.dsa.service;

import java.util.*;

public class LuckyNumbersMatrix {
    /**
     * Time: O(m * n), space: O(max(m, n)), where m = matrix.length, n = matrix[0].length.
     * @param matrix
     * @return
     */
    public static List<Integer> luckyNumbers (int[][] matrix) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++){
            int minimumEle = Integer.MAX_VALUE;

            for(int j=0; j<m; j++){
                minimumEle = Math.min(matrix[i][j], minimumEle);
            }
            map.put(minimumEle, map.getOrDefault(minimumEle, 0)+1);

        }

        for(int i=0; i<m; i++){
            int maximumEle = Integer.MIN_VALUE;
            for(int j=0; j<n; j++){
                maximumEle = Math.max(matrix[j][i], maximumEle);
            }

            map.put(maximumEle, map.getOrDefault(maximumEle, 0)+1);
        }

        for(int key: map.keySet()) {
            if(map.get(key)>1){
                list.add(key);
            }
        }
        return list;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] matrix = new int[n][];
        for(int i=0; i<n; i++){
            int m = scan.nextInt();
            int[] internalMatrix = new int[m];
            for(int j=0; j<m; j++){
                internalMatrix[j] = scan.nextInt();
            }
            matrix[i] = internalMatrix;
        }

        List<Integer> resultList = luckyNumbers(matrix);
        for(int ele: resultList){
            System.out.print(ele+" ");
        }
    }
}
