package com.company;

public class Main {

    public static void main(String[] args) {
        TwoStudents Sam = new TwoStudents("Sam",2,12345,"UK");
        TwoStudents John = new TwoStudents("John",3,56789,"California");

        System.out.println(Sam.getAddress());
        System.out.println(Sam.getName());
        System.out.println(Sam.getNumber_phone());
        System.out.println(Sam.getRoll() +"\n");

        System.out.println(John.getAddress());
        System.out.println(John.getName());
        System.out.println(John.getNumber_phone());
        System.out.println(John.getRoll());
    }
}

