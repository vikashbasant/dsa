package com.dsapractices.dsa.pepcoding;

import java.util.Scanner;

public class PrintAllThePrimeFactor {
    /**
     * Print all the prime factor:
     * @param num
     */
    private static void printPrimeFactor(int num){
        for(int div=2; div*div<=num; div++){
            while(num%div == 0){
                System.out.print(div+" ");
                num/=div;
            }
        }
        if(num != 1){
            System.out.println(num);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printPrimeFactor(num);
    }
}
