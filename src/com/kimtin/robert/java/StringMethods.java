package com.kimtin.robert.java;

public class StringMethods {
    public static void main(String args[]) {
        String str1 = "Hello Students" + "Welcome to java class";
        String str2 = "welcome";
        String str3 = "";
        String str4 = " ";

        System.out.println(str1.length());
        System.out.println(str1.substring(1));
        System.out.println(str1.substring(6, 13));
        System.out.println(str1.contains("Students"));
        System.out.println(str2.equals("Welcome"));
        System.out.println(str2.equalsIgnoreCase("Welcome"));
        System.out.println(str3.isEmpty());


    }

}
