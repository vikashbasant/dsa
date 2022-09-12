package com.dsapractices.dsa.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShortestDistanceCharacter {
    /*
    timeComplexity: O(N)
    spaceComplexity: O(N)
     */
    public static int[] shortestToChar(String s, char c) {

        int n = s.length();
        int[] leftDistance = new int[n];
        Arrays.fill(leftDistance, Integer.MAX_VALUE);
        for(int i=0; i<n; ){
            if(s.charAt(i) == c){
                int count = 0;
                leftDistance[i] = count++;
                int j = i+1;
                while(j<n && s.charAt(j) != c){
                    leftDistance[j] = count++;
                    j++;
                }
                i = j;
            }else{
                i++;
            }
        }


        int[] rightDistance = new int[n];
        Arrays.fill(rightDistance, Integer.MAX_VALUE);
        for(int i=n-1; i>=0; ){
            if(s.charAt(i) == c){
                int count = 0;
                rightDistance[i] = count++;
                int j = i-1;
                while(j>=0 && s.charAt(j) != c){
                    rightDistance[j] = count++;
                    j--;
                }
                i = j;
            }else{
                i--;
            }
        }

//        System.out.println(Arrays.toString(leftDistance));
//        System.out.println(Arrays.toString(rightDistance));

        int result[] = new int[n];
        for(int i=0; i<n; i++){
            result[i] = Math.min(leftDistance[i], rightDistance[i]);
        }
        return result;
    }


//======================================Another Way===============================================//
    /*
        timeComplexity: O(N)
        spaceComplexity: O(N)
     */
    public static int[] shortestToChar1(String s, char c){
        int n = s.length();
        int[] leftToRightDistance = new int[n];
        int[] rightToLeftDistance = new int[n];

        Arrays.fill(leftToRightDistance, Integer.MAX_VALUE);
        Arrays.fill(rightToLeftDistance, Integer.MAX_VALUE);

        // Distance from every character from char c(left to right):
        int runningDis = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == c){
                runningDis = 0;
                leftToRightDistance[i] = runningDis++;
            }else{
                if(runningDis != Integer.MAX_VALUE){
                    leftToRightDistance[i] = runningDis++;
                }
            }
        }

        // Distance from every character from char c(left to right):
        runningDis = Integer.MAX_VALUE;
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) == c){
                runningDis = 0;
                rightToLeftDistance[i] = runningDis++;
            }else{
                if(runningDis != Integer.MAX_VALUE){
                    rightToLeftDistance[i] = runningDis++;
                }
            }
        }

        int result[] = new int[n];
        for(int i=0; i<n; i++){
            result[i] = Math.min(leftToRightDistance[i], rightToLeftDistance[i]);
        }
        return result;
    }
//===============================Better Approach====================================================//
    public static int[] shortestToCharBetter(String s, char c){
        int n = s.length();
        List<Integer> list = new ArrayList<>();
        list.add(-10000);
        for(int i=0; i<n; i++){
            if(s.charAt(i) == c){
                list.add(i);
            }
        }
        list.add(Integer.MAX_VALUE);

        int[] result = new int[n];

        int firstIndex = list.get(0);
        int secondIndex = list.get(1);
        int k = 2;
        for(int i=0; i<n; i++){
            if(s.charAt(i) != c){
                result[i] = Math.min(i-firstIndex, secondIndex-i);
            }else{
                firstIndex = secondIndex;
                secondIndex = list.get(k++);
            }
        }
        return result;
    }
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.nextLine();
        char ch = scan.next().charAt(0);
        scan.nextLine();
        int[] result = shortestToCharBetter(str, ch);
        System.out.println(Arrays.toString(result));
    }
}
