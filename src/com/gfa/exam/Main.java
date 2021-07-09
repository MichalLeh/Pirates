package com.gfa.exam;

public class Main {

    public static void main(String[] args) {
        Ship ship = new Ship();

        Pirate jack = new Pirate("Jack");
        Pirate john = new Pirate("John");
        Pirate silver = new Pirate("Silver");
        Pirate mike = new Pirate("Mike");

        ship.add(jack);
        ship.add(john);
        ship.add(silver);
        ship.add(mike);

        ship.prepareForBattle();

        System.out.println(jack.toString());
        System.out.println(john.toString());
        System.out.println(silver.toString());
        System.out.println(mike.toString());

        System.out.println(ship.getGolds());
        System.out.println(ship.getCrewSize());
        System.out.println(ship.getPoorPirates());
    }
}
