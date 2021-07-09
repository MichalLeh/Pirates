package com.gfa.exam;

public class Main {

    public static void main(String[] args) {

        Pirate jack = new Pirate("Jack");
        Pirate john = new Pirate("John");
        jack.work();
        john.work();
        System.out.println(jack.toString());
        System.out.println(john.toString());
    }
}
