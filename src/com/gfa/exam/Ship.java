package com.gfa.exam;

import java.util.ArrayList;

public class Ship {
    private ArrayList<Pirate> pirates;
    private ArrayList<String> poorPirates;

    public Ship() {
        this.pirates = new ArrayList<>();
        this.poorPirates = new ArrayList<>();
    }

    // add new pirates to the ship. It can have only one captain
    public void add(Pirate pirate) {
        if(!pirate.isCaptain()) {
            this.pirates.add(pirate);
        } else {
            boolean shipHasCaptain = false;
            for(int i=0; i<this.pirates.size(); i++){
                if(this.pirates.get(i).isCaptain()){
                    shipHasCaptain = true;
                }
            }
            if (shipHasCaptain == false){
                this.pirates.add(pirate);
            }
        }
    }

    // returns the number of pirates on the ship
    public int getCrewSize(){
        return this.pirates.size();
    }

    // returns a list of names containing the pirates that have a wooden leg and have less than 15 golds
    public ArrayList<String> getPoorPirates(){
        for(Pirate pirate : this.pirates){
            if(pirate.getHasWoodenLeg() && pirate.getGoldAmount() < 15){
                this.poorPirates.add(pirate.getName());
            }
        }
        return this.poorPirates;
    }

    // returns the sum of gold owned by the pirates of the ship
    public int getGolds(){
        int sumOfGold = 0;
        for(Pirate pirate : this.pirates){
            sumOfGold += pirate.getGoldAmount();
        }
        return sumOfGold;
    }

    // calls the pirates' party() method.
    public void lastDayOnTheShip(Pirate pirate){
        pirate.party();
    }

    // calls  pirate's work() and ship's lastDayOnTheShip() methods
    public void prepareForBattle(){
        for (Pirate pirate : this.pirates) {
            for(int count=0; count<5; count++) {
                pirate.work();
                if(count == 4){
                    lastDayOnTheShip(pirate);
                }
            }
        }
    }
}
