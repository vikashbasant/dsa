package com.dsapractices.dsa.service;

import java.util.HashMap;

public class HashMapDemo1 {
    /**
     * In case of HashMap, JVM will identify the duplicate keys by using .equals() method.
     * We know .equals() method comparison the content.
     * System.out.println(I1.equals(I2)); // return true
     * @param args
     */
    public static void main(String[] args){
        HashMap m = new HashMap();
        Integer I1 = new Integer(10);
        Integer I2 = new Integer(10);
        m.put(I1, "vikas");
        m.put(I2, "prince");
        System.out.println(m); // {10=prince}
    }
}
