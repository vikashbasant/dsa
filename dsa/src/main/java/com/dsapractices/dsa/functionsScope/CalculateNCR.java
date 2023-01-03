package com.dsapractices.dsa.functionsScope;

import java.util.Scanner;

public class CalculateNCR {

    /**
     * Find the factorial:
     * @param n
     * @return
     */
    private static int fact(int n){
        int fac = 1;
        for(int i=1; i<=n; i++){
            fac *= i;
        }
        return fac;
    }

    /**
     * Find the NcR using formula: NcR = N!/(R! * (N-R)!)
     * @param n
     * @param r
     * @return
     */
    private static int findNCR(int n, int r){
        int nFact = fact(n);
        int rFact = fact(r);
        int nrFact = fact(n-r);

        int result = nFact/(rFact * nrFact);
        return result;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        int result = findNCR(n, r);
        System.out.println(result);
    }
}
