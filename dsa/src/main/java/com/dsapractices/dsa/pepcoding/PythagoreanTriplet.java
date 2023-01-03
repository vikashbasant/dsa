package com.dsapractices.dsa.pepcoding;

import java.util.Scanner;

public class PythagoreanTriplet {

    /**
     * Check weather valid PythagoreanTriplet or not:
     * TimeComplexity: O(1)
     * SpaceComplexity: O(1)
     * @param sideA
     * @param sideB
     * @param sideC
     * @return
     */
    private static boolean isPythagorean(int sideA, int sideB, int sideC) {

        // If all side is not same then we need to check isPythagorean or not:
        if((sideA != sideB) && (sideB != sideC)){

            // Find the bigger side first:
            int biggerSide = ((sideA > sideB)?(Math.max(sideA, sideC)):(Math.max(sideB, sideC)));

            // Main logic is: all side square - biggerSide square:
            int abs = Math.abs((sideA * sideA) + (sideB * sideB) + (sideC * sideC) - (biggerSide*biggerSide));

            // if abs is equal to biggerSide square that means Pythagorean otherwise not:
            return abs == biggerSide * biggerSide;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sideA;
        int sideB;
        int sideC;
        sideA = scan.nextInt();
        sideB = scan.nextInt();
        sideC = scan.nextInt();

        boolean isPythagorean = isPythagorean(sideA, sideB, sideC);
        if(isPythagorean){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
