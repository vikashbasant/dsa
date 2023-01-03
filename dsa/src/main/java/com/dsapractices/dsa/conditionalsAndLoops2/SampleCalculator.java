package com.dsapractices.dsa.conditionalsAndLoops2;

import java.util.Scanner;

public class SampleCalculator {

    /**
     * Simple Calculator:
     * @param args
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("num = ");
            int num = scan.nextInt();

            if(num > 6){
                System.out.println("Invalid Choice");
            }else if(num == 6){
                System.out.println("Exist!");
                break;
            }else{
                System.out.println("num1 = ");
                int num1 = scan.nextInt();
                System.out.println("num2 = ");
                int num2 = scan.nextInt();
                if(num == 5){
                    int rem = (num1%num2);
                    System.out.println(rem);
                }else if(num == 4){
                    int quo = (num1/num2);
                    System.out.println(quo);
                }else if(num == 3){
                    int mul = (num1*num2);
                    System.out.println(mul);
                }else if(num == 2){
                    int diff = (num1-num2);
                    System.out.println(diff);
                }else if(num == 1){
                    int add = (num1+num2);
                    System.out.println(add);
                }
            }
        }
    }
}
