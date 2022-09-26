package com.dsapractices.dsa.service;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();

        Integer i1 = s1.length();
        Integer i2 = s2.length();

        if(i1 == i2){
            return s1.compareTo(s2);
        }
        return  (i1).compareTo(i2);
    }
}
public class StringAndStringBufferIntoTreeSet {
    public static void main(String[] args){
        TreeSet t = new TreeSet(new MyComparator());
        t.add("vikash");
        t.add("basant");
        t.add(new StringBuffer("prince"));
        t.add(new StringBuffer("sona"));
        t.add(new StringBuffer("neha"));
        t.add("rajesh");
        System.out.println("t = " + t);
    }
}
