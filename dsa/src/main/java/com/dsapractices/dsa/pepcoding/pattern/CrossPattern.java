package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class CrossPattern {

    /**
     * CrossPattern:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void crossPattern(int size){
        // For Row:
        for(int i=1; i<=size; i++){ //-> size+1
            // For Column:
            for(int j=1; j<=size; j++){ //-> size*(size+1)
                // Condition for CrossPattern:
                if((i == j) || ((i+j) == size+1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            // For New Line:
            System.out.println(); // -> size
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        crossPattern(size);
    }
}
