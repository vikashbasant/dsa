package com.dsapractices.dsa.service;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    /**
     * In case of HashMap, JVM will identify the duplicate keys by using == operator.
     * We know == Operator comparison the reference(address).
     * System.out.println(I1==I2); // return false
     * @param args
     */
    public static void main(String[] args){
        IdentityHashMap im = new IdentityHashMap();
        Integer I1 = new Integer(10);
        Integer I2 = new Integer(10);
        im.put(I1, "Vikas");
        im.put(I2, "prince");
        System.out.println(im); // {10=Vikas, 10=prince}
    }
}
