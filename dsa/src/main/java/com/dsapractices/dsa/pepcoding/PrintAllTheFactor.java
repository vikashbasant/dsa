package com.dsapractices.dsa.pepcoding;

import java.util.Scanner;

public class PrintAllTheFactor {

    /**
     * Print all the factor and return total number of factor:
     * TimeComplexity: O(sqrt(num))
     * SpaceComplexity: O(1)
     * @param num
     * @return
     */
    private static int printAllFactor(int num){

        int totalFact = 0;
        for(int i=1; i*i<=num; i++){
            if(num%i == 0){
                // if both factor is same then count 1 factor: otherwise count 2 factor:
                if(i == (num/i)){
                    totalFact++;
                }else{
                    totalFact+=2;
                }
                System.out.println(i+" "+ num/i);

            }
        }
        return  totalFact;

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int totalFact = printAllFactor(num);
        System.out.println("totalFact = " + totalFact);
    }
}
