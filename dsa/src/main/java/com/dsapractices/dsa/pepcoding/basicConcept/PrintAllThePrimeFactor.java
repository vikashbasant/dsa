package com.dsapractices.dsa.pepcoding.basicConcept;

import java.util.Scanner;

public class PrintAllThePrimeFactor {
    /**
     * Print all the prime factor:
     * TimeComplexity: O(sqrt(num))
     * SpaceComplexity: O(1)
     * @param num
     */
    private static void printPrimeFactor(int num){
        // Outer Loop traverse exactly sqrt(num):
        for(int div=2; div*div<=num; div++){
            // Inner loop traverse till num become 0:
            while(num%div == 0){
                System.out.print(div+" ");
                num/=div;
            }
        }
        // If num is not become 0 i.e num itself a prime factor:
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
