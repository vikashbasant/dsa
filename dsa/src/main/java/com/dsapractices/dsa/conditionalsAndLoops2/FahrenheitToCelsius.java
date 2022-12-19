package com.dsapractices.dsa.conditionalsAndLoops2;

import java.util.Scanner;

public class FahrenheitToCelsius {

    /**
     * Fahrenheit to Celsius formula is ((fahrenheit - 32) * 5)/9
     * @param s
     * @param e
     * @param w
     */
    private static void fToCelsius(int s, int e, int w){
        for(int i = s; i<=e; i+=w){
            int fahrenheitToCelsius = ((i-32)*5)/9;
            System.out.println(i+"\t"+fahrenheitToCelsius);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int startFahrenheitValue = scan.nextInt();
        int endFahrenheitValue = scan.nextInt();
        int stepSize = scan.nextInt();
        fToCelsius(startFahrenheitValue, endFahrenheitValue, stepSize);

    }
}
