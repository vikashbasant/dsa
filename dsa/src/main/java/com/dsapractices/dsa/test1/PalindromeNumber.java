package com.dsapractices.dsa.test1;

import java.util.Scanner;

public class PalindromeNumber {

    /**
     * Check weather number is palindrome or not:
     * @param num
     * @return
     */
    private static boolean isPalindrome(int num){
        int temp = num;
        int sum = 0;
        while(temp > 0){
            int rem = temp%10;
            sum = sum * 10 + rem;
            temp/=10;
        }

        if(sum == num){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        boolean result = isPalindrome(n);
        System.out.println("Number is Palindrome = " + result);

    }
}
