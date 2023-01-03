package com.dsapractices.dsa.operatorsForLoop5;

import java.util.Scanner;

public class AllPrimeNumber {

    /**
     * Check number is prime or not:
     * @param num
     * @return
     */
    private static boolean isPrime(int num){
        boolean isPrime  = true;
        for(int i=2; i<Math.sqrt(num); i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    /**
     * print the all prime number:
     * @param num
     */
    private static void printAllPrimeNumber(int num){
        for(int i=2; i<=num; i++){
            boolean result = isPrime(i);
            if(result){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printAllPrimeNumber(num);
    }
}
