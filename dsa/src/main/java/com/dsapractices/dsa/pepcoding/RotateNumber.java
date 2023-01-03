package com.dsapractices.dsa.pepcoding;

import java.util.Scanner;

public class RotateNumber {
    /**
     * Count the digit of number:
     * TimeComplexity: O(log(num))
     * SpaceComplexity: O(1)
     * @param num
     * @return
     */
    private static int countDigit(int num){
        int count = 0;
        while(num > 0){
            count++;
            num/=10;
        }
        return count;
    }

    /**
     * Rotate Number by K:
     * TimeComplexity: O(log(num) + k)
     * SpaceComplexity: O(1)
     * @param num
     * @param k
     * @return
     */
    private static int rotateNumHelper(int num, int k){
        int digit = countDigit(num);
        for(int i=1; i<=k; i++){
            int rem = num%10;
            int rotateBy1 =  (rem * (int)Math.pow(10, digit-1));
            num = rotateBy1 + num/10;
        }
        return num;
    }

    /**
     * TimeComplexity: O(log(num))
     * SpaceComplexity: O(1)51234
     * @param num
     * @param k
     * @return
     */
    private static int rotateNumHelperBySir(int num, int k){

        // num = 25398
        // k = 2

        // Find the digit of number:
        int digit = countDigit(num); // digit = 5

        // Find the number which is divisor:
        int divisor = (int)Math.pow(10, k); // divisor = 100

        int multiplier = (int)Math.pow(10, digit-k); // multiplier = 1000

        // Find the number of digit which is rotated:
        int rem = num% divisor; // rem = 98

        // Find the quotient:
        int quo = num/divisor; // quo = 253

        // Rotate number:
        int rotateNum = (rem * multiplier) + quo; // rotateNum = 98253

        // Simply return:
        return rotateNum; // rem = 98253
    }

    /**
     * Here we need to all the case like:
     *  1. rotate number by -k
     *  2. rotate number by k where k is greater than (digit of the number)
     *  3. rotate number by +k
     * @param num
     * @param k
     * @return
     */
    private static int rotateNum(int num, int k){
        int digit = countDigit(num);
        if(k < 0){
            k = digit + k;
        }

        return rotateNumHelperBySir(num, k%digit);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int k = scan.nextInt();
        int result = rotateNum(num, k);
        System.out.println("After " +  k + " rotation of number " + num + " = " + result);
    }
}
