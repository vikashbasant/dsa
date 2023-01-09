package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;


public class DecreasingMirrorFibonacciNumberPattern {

    /**
     * Decreasing Mirror Fibonacci Number Pattern:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void decreasingMirrorFibonacciNumberPattern(int size) {
        int a = 0;
        int b = 1;
        // For Row:
        for (int i = 1; i <= size; i++) {
            // For Column:
            for (int j = 1; j <= i; j++) {
                System.out.print(a +" ");
                int temp = a+b;
                a = b;
                b = temp;
            }
            // For New Line:
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        decreasingMirrorFibonacciNumberPattern(size);
    }
}
