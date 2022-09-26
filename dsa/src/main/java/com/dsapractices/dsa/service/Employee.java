package com.dsapractices.dsa.service;

public class Employee implements Comparable{

    private String name;
    private int eId;

    public Employee(){
        // Default Constructor:
    }

    public Employee(String name, int eId){
        this.name = name;
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", eId=" + eId +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Integer eId1 = this.eId;
        Employee e = (Employee) o;
        int eId2 = e.geteId();

        if(eId1 < eId2){
            return -1;
        }else if(eId1 > eId2){
            return +1;
        }else{
            return 0;
        }
    }
}
