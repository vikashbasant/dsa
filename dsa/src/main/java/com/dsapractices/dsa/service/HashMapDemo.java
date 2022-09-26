package com.dsapractices.dsa.service;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap m = new HashMap();
        m.put("vikas", 700);
        m.put("prince", 800);
        m.put("neha", 200);
        m.put("rohit", 500);
        System.out.println(m);
        System.out.println(m.put("vikas", 1000));

        Set s = m.keySet();
        System.out.println(s);

        Collection c = m.values();
        System.out.println(c);

        Set s1 = m.entrySet();
        System.out.println(s1);

        Iterator itr = s1.iterator();
        while(itr.hasNext()){
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey() + " " + m1.getValue());

            if(m1.getKey().equals("neha")){
                m1.setValue(10000);
            }
        }
        System.out.println(m);
    }
}
