package com.dsapractices.dsa.service;

import java.util.HashMap;

public class HashMapDemo2 {
    public static void main(String[] args) throws InterruptedException {
        HashMap m = new HashMap();
        TempHashtable t = new TempHashtable();
        m.put(t, "vikas");
        System.out.println(m);

        t = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);
    }
}

class Temp{
    public String toString(){
        return "temp";
    }
    public void finalize(){
        System.out.println("Finalize method called");
    }
}
