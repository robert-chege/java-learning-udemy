package com.kimtin.robert.java;

public class EncapsulationMethod {
    public static void main(String args[]){
        Encapsulation cust1 = new Encapsulation();
        cust1.setName("John");
        cust1.setIdNum("23435");
        cust1.setAge(35);
        System.out.println(String.format("%s's with id num: %S is %d years old", cust1.getName(), cust1.getIdNum(), cust1.getAge()));


    }
}
