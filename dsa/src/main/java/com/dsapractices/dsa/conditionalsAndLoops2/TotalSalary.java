package com.dsapractices.dsa.conditionalsAndLoops2;

import java.util.Scanner;

public class TotalSalary {
    /**
     * Find the total salary of person:
     * @param basic
     * @param grade
     */
    private static void printTotalSalary(int basic, char grade){
        double hra = 0.2 * basic;
        double da = 0.5 * basic;

        int allow;
        if(grade == 'A'){
            allow = 1700;
        }else if(grade == 'B'){
            allow = 1500;
        }else{
            allow = 1300;
        }

        double pf = 0.11 * basic;

        double totalSalary = basic + hra + da + allow - pf;
        int result = (int)Math.round(totalSalary);
        System.out.println(result);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int basic = scan.nextInt();
        char grade = scan.next().charAt(0);

        printTotalSalary(basic, grade);
    }
}
