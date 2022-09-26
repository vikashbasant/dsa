package com.dsapractices.dsa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Student> std = new ArrayList<Student>();
        Student s1 = new Student("vikas", 25, 3456);
        Student s2 = new Student("karu", 20, 1236.0);
        Student s3 = new Student("rohit", 22, 12356);
        Student s4 = new Student("prince", 24, 433.36);
        Student s5 = new Student("neha", 15, 342323.56);

        std.add(s1);
        std.add(s2);
        std.add(s3);
        std.add(s4);
        std.add(s5);

        System.out.println(std);

        List<Student> incrementSalary = std.stream().map(e -> {
            if (e.getAge() > 21) {
                e.setSalary(Math.round(e.getSalary() * 1.10));
            }
            return e;
        }).collect(Collectors.toList());

        System.out.println(incrementSalary);



    }
}
