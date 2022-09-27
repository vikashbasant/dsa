package com.dsapractices.dsa.service;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {
        WeakHashMap m = new WeakHashMap();
        Temp1 t = new Temp1();
        m.put(t, "vikas");
        System.out.println(m);

        t = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);
    }
}

class Temp1{
    public String toString(){
        return "temp";
    }
    public void finalize(){
        System.out.println("Finalize method called");
    }
}

