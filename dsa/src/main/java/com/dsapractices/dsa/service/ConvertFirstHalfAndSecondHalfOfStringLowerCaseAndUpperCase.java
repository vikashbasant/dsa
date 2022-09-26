package com.dsapractices.dsa.service;

import java.util.Scanner;

public class ConvertFirstHalfAndSecondHalfOfStringLowerCaseAndUpperCase {
    /**
     * timeComplexity: O(N)
     * spaceComplexity: O(1)
     * @param str
     * @return
     */
    private static String convertString(String str){
        int mid = str.length()/2;

        String lowerCaseString = "";
        String upperCaseString = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(i<mid){
                lowerCaseString += Character.toLowerCase(ch);
            }else{
                upperCaseString += Character.toUpperCase(ch);
            }
        }
        return lowerCaseString+upperCaseString;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String result = convertString(str);
        System.out.println(result);
    }
}
