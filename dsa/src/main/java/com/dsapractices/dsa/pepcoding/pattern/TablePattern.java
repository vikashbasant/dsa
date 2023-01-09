package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;


public class TablePattern {
    private static final int TABLE_SIZE = 10;

    /**
     * Print Table Pattern:
     * TimeComplexity: O(TABLE_SIZE)
     * SpaceComplexity: O(1)
     * @param num
     */
    private static void printTableOfNum(int num) {

        // For Row:
        for(int i=1; i<=TABLE_SIZE; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printTableOfNum(num);
    }
}
