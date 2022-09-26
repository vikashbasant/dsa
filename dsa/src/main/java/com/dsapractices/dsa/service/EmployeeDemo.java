package com.dsapractices.dsa.service;

import java.util.Comparator;
import java.util.TreeSet;
class MyComparator1 implements Comparator {
    /**
     * Here we need sort the treeset using name:
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        return (e1.getName()).compareTo(e2.getName());
    }
}
public class EmployeeDemo {
    public static void main(String[] args){
        Employee e1 = new Employee("vikas", 100);
        Employee e2 = new Employee("rahul", 200);
        Employee e3 = new Employee("chandan", 50);
        Employee e4 = new Employee("rohit", 150);
        Employee e5 = new Employee("shoan", 100);

        TreeSet t = new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t);

        TreeSet t1 = new TreeSet(new MyComparator1());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println(t1);
    }
}
