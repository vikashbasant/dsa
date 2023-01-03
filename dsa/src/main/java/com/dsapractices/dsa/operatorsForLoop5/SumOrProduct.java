package com.dsapractices.dsa.operatorsForLoop5;

import java.util.Scanner;

public class SumOrProduct {

    private static int sum(int num){
        int total = 0;
        for(int i=1; i<=num; i++){
            total += i;
        }
        return total;
    }

    private static int mul(int num){
        int product = 1;
        for(int i=1; i<=num; i++){
            product *= i;
        }
        return product;
    }

    /**
     * Find the sum of n digit and product of n digit:
     * @param args
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                int add = sum(num);
                System.out.println(add);
                break;
            case 2:
                int product = mul(num);
                System.out.println(product);
                break;
            default:
                System.out.println(-1);
                break;
        }
    }
}
