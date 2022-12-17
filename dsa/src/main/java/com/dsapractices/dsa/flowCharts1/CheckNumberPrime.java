package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;

public class CheckNumberPrime {

    /**
     * Check Weather Number is prime or not:
     * @param num
     * @return
     */
    private static boolean isPrime(int num){
        boolean isPrime = true;
        for(int i=2; i<num; i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    private static boolean isPrime1(int num){
        boolean isPrime = true;
        for(int i=2; i<(num/2); i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    private static boolean isPrimeBetter(int num){
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean isPrime = isPrimeBetter(num);
        System.out.println("isPrime = " + isPrime);
    }
}
