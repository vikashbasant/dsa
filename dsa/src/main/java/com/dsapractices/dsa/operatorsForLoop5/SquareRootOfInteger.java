package com.dsapractices.dsa.operatorsForLoop5;

import java.util.Scanner;

public class SquareRootOfInteger {

    /**
     * TimeComplexity: O(sqrt(num))
     * SpaceComplexity: O(1)
     * @param num
     * @return
     */
    private static int squareRoot(int num){
        if(num == 0 || num == 1){
            return num;
        }
        int count = 1;
        while(count*count <= num){
            count++;
        }
        return count-1;
    }

    /**
     * TimeComplexity: O(log(num)) and also same TimeComplexity of Math.sqrt():
     * SpaceComplexity: O(1)
     * @param num
     * @return
     */
    private static int squareRoot1(int num){
        if(num == 0 || num == 1){
            return num;
        }

        long start = 1, end = num/2,  ans = 0;
        while(start<=end){
            long mid = (start+end)/2;

            // If num is prefect Square:
            if(mid * mid == num){
                return (int)mid;
            }

            // Since we need floor, we update answer when
            // mid * mid is smaller than num, and move closer to
            // sqrt(num)
            if(mid * mid < num){
                start = mid + 1;
                ans = mid;
            }else{
                // If mid * mid is greater than num:
                end = mid - 1;
            }
        }
        return (int)ans;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = squareRoot1(num);
        System.out.println(result);
    }
}
