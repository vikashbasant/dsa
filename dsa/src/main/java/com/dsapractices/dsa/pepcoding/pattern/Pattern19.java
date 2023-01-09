package com.dsapractices.dsa.pepcoding.pattern;

import java.util.Scanner;

public class Pattern19 {

    /**
     * Pattern 19:
     * TimeComplexity: O(size^2)
     * SpaceComplexity: O(1)
     * @param size
     */
    private static void pattern19(int size) {
        // For Row:
        for (int i = 1; i <= size; i++) {
            // For Star:
            for (int j = 1; j <= size; j++) {

                // If Row == 1:
                if(i == 1){
                    if (j <= ((size / 2) + 1) || j == size) {
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                // If Row <= size/2:
                }else if(i <= size/2){
                    if((j == ((size / 2) + 1)) || j == size){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                // If Row == size/2 + 1:
                }else if(i == ((size/2)+1)){
                    System.out.print("* ");
                // If Row >= size/2 + 1:
                }else if(i >= ((size/2)+1) && i < size){
                    if((j == 1 || j == (size / 2) + 1)){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                // If Row == size:
                }else if(i == size){
                    if (j == 1 || j >= ((size / 2) + 1)) {
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }

            }
            // For New Line:
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        pattern19(size);
    }
}
