package com.gfa.exam;

public class Main {

    public static void main(String[] args) {
        // init
        Ship ship = new Ship();
        Pirate blackbeard = new Pirate("Blackbeard");
        Pirate johnSilver = new Pirate("John Silver");
        Pirate jFlint = new Pirate("J. Flint");
        Pirate henryMorgan = new Pirate("Henry Morgan");
        Pirate francisDrake = new Pirate("Francis Drake");

        // add pirates to the ship
        ship.add(blackbeard);
        ship.add(johnSilver);
        ship.add(jFlint);
        ship.add(henryMorgan);
        ship.add(francisDrake);

        ship.prepareForBattle();

        System.out.println(blackbeard);
        System.out.println(johnSilver);
        System.out.println(jFlint);
        System.out.println(henryMorgan);
        System.out.println(francisDrake);

        System.out.println("");

        System.out.println("Amount of gold: " + ship.getGolds());
        System.out.println("Crew size: " + ship.getCrewSize());
        System.out.println("Poor pirates: " + ship.getPoorPirates());
    }
}
