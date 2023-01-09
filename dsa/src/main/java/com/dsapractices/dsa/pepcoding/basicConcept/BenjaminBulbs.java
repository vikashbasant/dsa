package com.dsapractices.dsa.pepcoding.basicConcept;

import java.util.Scanner;

public class BenjaminBulbs {

    /**
     * Benjamin Bulbs puzzle: Check the bulb is ON:
     * TimeComplexity: O(sqrt(num))
     * SpaceComplexity: O(1)
     * @param num
     * @return
     */

    private static int onBulb(int num){
        int onBulb = 0;
        // all the perfect square has 2n+1 factor i.e the bulb is ON:
        for(int i=1; i*i<=num; i++){
            System.out.println("The position of bulb is ON = " + i*i);
            onBulb++;
        }
        return onBulb;
    }

    /**
     * All the perfect square number factor is odd number = 2n+1,
     * if factor is odd that means bulb is ON, otherwise bulb is OFF
     * @param args
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        // find out the total number of bulb is ON:
        int result = onBulb(num);
        System.out.println("The number of bulb is ON = " + result);
    }
}
