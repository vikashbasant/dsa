package com.dsapractices.dsa.conditionalsAndLoops2;

import java.util.Scanner;

public class FindCharacterCase {

    /**
     * check weather ch is rnage between 'A' to 'Z' or 'a' to 'z'
     * @param ch
     */
    private static void printCharacterCase(char ch){
        if(ch >= 65 && ch <= 90){
            System.out.println("1");
        }else if(ch >= 97 && ch <= 122){
            System.out.println("0");
        }else{
            System.out.println("-1");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        printCharacterCase(ch);
    }
}
