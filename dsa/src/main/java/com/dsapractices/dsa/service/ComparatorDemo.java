package com.dsapractices.dsa.service;

import java.util.Comparator;
import java.util.TreeSet;

class DescendingComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        if(i1<i2){
            return +1;
        }else if(i1>i2){
            return -1;
        }else{
            return 0;
        }

        // Or we can do:
        // return i2.compareTo(i1);
        // Or we can do this way:
        // return -i1.compareTo(i2);
    }
}

class AsscendingComparator implements Comparator{

    @Override
    public int compare(Object thisObj, Object thatObj) {
        Integer i1 = (Integer) thisObj;
        Integer i2 = (Integer) thatObj;

//        if(i1 < i2){
//            return -1;
//        }else if(i1>i2){
//            return +1;
//        }else{
//            return 0;
//        }
        // Or we can do:
        // return i1.compareTo(i2);
        // or we can do:
        return -i2.compareTo(i1);
    }
}

class InsertionOrderComparator implements Comparator{
    /**
     * If we want insertion order preserved in TreeSet then used this method, and duplicate allowed.
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        return +1;
    }
}

class ReverseInsertionOrderComparator implements Comparator{
    /**
     * If we want reverse of  insertion order preserved in TreeSet then used this method, and duplicate allowed.
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        return -1;
    }
}

class AlwaysTreeSetHasOnlyElement implements Comparator{
    /**
     * Only first element will be inserted & and all remaining element consider as duplicate, if we want return 0 (that
     * means)
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {

        TreeSet t = new TreeSet(new AlwaysTreeSetHasOnlyElement());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(20);
        t.add(20);
        t.add(30);
        t.add(40);
        System.out.println("t = " + t);
    }
}
