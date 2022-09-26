package com.dsapractices.dsa.service;

import java.util.Comparator;
import java.util.TreeSet;

class ReverseOfAlphabeticalComparator implements Comparator{


    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return -s1.compareTo(s2);
    }
}

public class StringWithTreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<>(new ReverseOfAlphabeticalComparator());
        s.add("Vikas");
        s.add("Kamlesh");
        s.add("Zen Jack");
        s.add("Ramesh");
        s.add("Umesh");
        s.add("Saviour");

        System.out.println("s = " + s);
    }
}
