package com.dsapractices.dsa.test1;

import java.util.Scanner;

public class CheckAP {

    /**
     * Check the array is in AP or not:
     * @param arr
     * @param n
     * @return
     */
    private static boolean isCheckAP(int[] arr, int n){
        if(n == 1){
            return true;
        }

        int d = arr[1]-arr[0];
        for(int i=2; i<n; i++){
            if(arr[i]-arr[i-1] != d){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        boolean result = isCheckAP(arr,n);
        System.out.println(result);
    }
}
