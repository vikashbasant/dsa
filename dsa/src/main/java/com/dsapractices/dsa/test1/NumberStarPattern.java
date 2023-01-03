package com.dsapractices.dsa.test1;

import java.util.Scanner;

public class NumberStarPattern {

    /**
     * Print Number Star Pattern:
     * @param num
     */
    private static void numberStarPattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=num; j>=1; j--){
                if(i == j){
                    System.out.print("* ");
                }else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        numberStarPattern(num);
    }
}
