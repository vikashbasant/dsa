package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;

public class PrintAllPrimeNo {

    /**
     * Check the prime number:
     * @param num
     * @return
     */
    private static boolean isPrime(int num){
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    /**
     * Print all the prime number:
     * @param num
     */
    private static void printAllPrime(int num){
        for(int i=1; i<=num; i++){
            boolean result = isPrime(i);
            if(result){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printAllPrime(num);
    }

}
