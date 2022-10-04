package com.dsapractices.dsa.service;

import java.util.Hashtable;

class TempHashtable {
    private int i;

    public TempHashtable(){
        // Default Constructor:
    }

    public TempHashtable(int i){
        this.i = i;
    }

    public int hashCode() {
        return i;
//        return i%9;
    }

    public String toString(){
        return i+"";
    }
}
public class HashtableDemo {
    public static void main(String[] args){
        Hashtable h = new Hashtable(25);
        h.put(new TempHashtable(5), "A");
        h.put(new TempHashtable(2), "B");
        h.put(new TempHashtable(6), "C");
        h.put(new TempHashtable(15), "D");
        h.put(new TempHashtable(23), "E");
        h.put(new TempHashtable(16), "F");

        /**
         * Default capacity of hashtable is 11.
         * To print hashtable:
         *  Top to Bottom
         *      -> For Right to left
          */
        System.out.println(h);

    }
}
