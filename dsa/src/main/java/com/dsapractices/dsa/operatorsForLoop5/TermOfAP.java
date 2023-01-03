package com.dsapractices.dsa.operatorsForLoop5;

import java.util.Scanner;

public class TermOfAP {
    /**
     * Print the AP series upto x term using formula 3*n+2:
     * @param x
     */
    private static void printTheAPSeries(int x){
        int count = 1;
        for(int i=1; count<=x; i++){
            int temp = 3*i + 2;
            if(temp % 4 != 0){
                System.out.print(temp+" ");
                count++;
            }
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        printTheAPSeries(x);
    }
}
