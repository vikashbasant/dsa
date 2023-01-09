package com.dsapractices.dsa.pepcoding.basicConcept;

import java.util.Scanner;

public class InverseOfNumber {

    /**
     * Inverse of Number:
     * Logic:
     *     int num =  41253                    num = 25134
     *
     *       Before Inverse            |         After Inverse
     *     Position     Digit          |    Position       Digit
     *         1          3            |        1            4
     *         2          5            |        2            3
     *         3          2            |        3            1
     *         4          1            |        4            5
     *         5          4            |        5            2
     *
     *  Swap the position and digit in inverse:
     *
     * TimeComplexity: O(log(num))
     * SpaceComplexity: O(1)
     * @param num
     * @return
     */
    private static int inverseNumber(int num){
        int position = 0;
        int inverseNum = 0;
        while(num>0){
            // Find the remainder:
            int rem = num%10;
            // Track the position:
            position+=1;
            // Generate the number:
            inverseNum += (position * Math.pow(10, rem-1));

            // Find the quotient
            num/=10;
        }
        return inverseNum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = inverseNumber(num);
        System.out.println(result);
    }
}
