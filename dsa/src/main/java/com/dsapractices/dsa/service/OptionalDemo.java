package com.dsapractices.dsa.service;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args){
        String str = null;

        Optional<String> optional = Optional.ofNullable(str);

        if(optional.isPresent()){
            System.out.println(optional.get());
        }else{
            String value = optional.orElse("Default");
            System.out.println("value is not present: " + value);
        }

    }
}
