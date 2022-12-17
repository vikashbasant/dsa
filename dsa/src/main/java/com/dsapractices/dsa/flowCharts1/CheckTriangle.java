package com.dsapractices.dsa.flowCharts1;

import java.util.Scanner;

public class CheckTriangle {

    /**
     * Check the triangle weather it is Equilateral, Isosceles and Scalene:
     * @param sideA
     * @param sideB
     * @param sideC
     */
    private static void isTriangle(int sideA, int sideB, int sideC){
        if(sideA == sideB && sideB == sideC ){
            System.out.println("Equilateral Triangle: All the three side are equals.");
        }else if(sideA == sideB || sideB == sideC || sideC == sideA){
            System.out.println("Isosceles Triangle: All two side are equal");
        }else{
            System.out.println("Scalene Triangle: No side are equal");
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sideA = scan.nextInt();
        int sideB = scan.nextInt();
        int sideC = scan.nextInt();
        isTriangle(sideA, sideB, sideC);
    }
}
