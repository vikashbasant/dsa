package com.dsapractices.dsa.service;

import java.util.Scanner;

public class FindIndexFirstOccurrenceString {
    /**
     * timeComplexity: O(N)
     * spaceComplexity: O(1)
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        if(haystackLength < needleLength){
            return -1;
        }
        for(int i=0; i<=haystackLength-needleLength; i++){
            if(haystack.substring(i, i+needleLength).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String haystack = scan.next();
        scan.nextLine();
        String needle = scan.next();
        int result = strStr(haystack, needle);
        System.out.println(result);
    }
}
