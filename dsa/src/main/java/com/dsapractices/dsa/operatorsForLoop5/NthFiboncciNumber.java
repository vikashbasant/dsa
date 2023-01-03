package com.dsapractices.dsa.operatorsForLoop5;

import java.util.Scanner;

public class NthFiboncciNumber {

    /**
     * Return the Nth fibonacci number:
     * @param num
     * @return
     */
    private static int nthFibo(int num){
        int a = 1;
        int b = 1;
        for(int i=1; i<num; i++){
            int temp = a+b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int result = nthFibo(num);
        System.out.println("Nth Fibonacci No = " + result);
    }
}
