package com.dsapractices.dsa.service;

import java.util.Comparator;
import java.util.TreeSet;
class ReverseOfAlphabeticalComparatorWithStringBuffer implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return -s1.compareTo(s2);
    }
}
public class StringBufferWithTreeSet {
    public static void main(String[] args){
        TreeSet<StringBuffer>  t = new TreeSet<>(new ReverseOfAlphabeticalComparatorWithStringBuffer());
        t.add(new StringBuffer("Vikas"));
        t.add(new StringBuffer("Kamlesh"));
        t.add(new StringBuffer("Zen"));
        t.add(new StringBuffer("Sobhva Rani"));
        t.add(new StringBuffer("Abisheak"));

        System.out.println("t = " + t);
    }
}
