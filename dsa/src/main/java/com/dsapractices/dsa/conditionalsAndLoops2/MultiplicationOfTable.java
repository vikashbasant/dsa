package com.dsapractices.dsa.conditionalsAndLoops2;

import java.util.Scanner;

public class MultiplicationOfTable {

    /**
     * print the multiplication table:
     * @param num
     */
    private static void printTableOfN(int num){
        for(int i=1; i<=10; i++){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printTableOfN(num);
    }
}
