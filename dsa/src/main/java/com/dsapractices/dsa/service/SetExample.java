package com.dsapractices.dsa.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args){
        Set<List<Integer>> set = new HashSet<>();

        set.add(Arrays.asList(1,2,3));
        set.add(Arrays.asList(2,1,3));
        set.add(Arrays.asList(3,1,2));


        for(List ele: set){
            for(Object e:ele){
                System.out.print(e+" ");
            }
            System.out.println();
        }

    }
}
