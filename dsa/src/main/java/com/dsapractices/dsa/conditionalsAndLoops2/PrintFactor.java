package com.dsapractices.dsa.conditionalsAndLoops2;

import java.util.Scanner;

public class PrintFactor {
    /**
     * print the factor of number:
     * @param num
     */
    private static void printAllFactor(int num){
        for(int i=2; i<=num/2; i++){
            if(num % i == 0){
                System.out.print(i+ " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printAllFactor(num);
    }
}
