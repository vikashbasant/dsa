package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;

public class ValidTriangle {

    /**
     * Check the Triangle is valid or not:
     * A triangle is a valid triangle, If and only If, the sum of any two sides of a triangle is greater than the third side.
     * For Example, let A, B and C are three sides of a triangle. Then, A + B > C, B + C > A and C + A > B
     * @param sideA
     * @param sideB
     * @param sideC
     * @return
     */
    private static boolean checkValidTriangle(int sideA, int sideB, int sideC){
        boolean isValidTriangle = false;
        if((sideA + sideB) > sideC || (sideB + sideC) > sideA || (sideC + sideA) > sideB){
            isValidTriangle = true;
        }
        return isValidTriangle;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sideA = scan.nextInt();
        int sideB = scan.nextInt();
        int sideC = scan.nextInt();

        boolean isValidTriangle = checkValidTriangle(sideA, sideB, sideC);
        if(isValidTriangle){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Not Valid Triangle");
        }
    }
}
