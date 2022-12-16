package com.dsapractices.dsa.service;

import java.util.Scanner;

public class SquareSumTriplet {
    private static int countSumTriplet(int num){
        int count = 0;
        for(int i=1; i<=num; i++){
            for(int j=i+1; j<=num; j++){
                int sqr = i*i + j*j;

                int k = (int) Math.sqrt(sqr);

                if(k*k == sqr && k<=num){
                    count+=2;
                }

                if((i+j) == (int)Math.sqrt(k) && (int)Math.sqrt(k)<=num){
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int ans = countSumTriplet(num);
        System.out.println(ans);
    }
}
