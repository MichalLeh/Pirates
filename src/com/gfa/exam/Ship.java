package com.gfa.exam;

import java.util.ArrayList;

public class Ship {
    private ArrayList<Pirate> pirates;
    private ArrayList<String> poorPirates;

    public Ship() {
        this.pirates = new ArrayList<>();
        this.poorPirates = new ArrayList<>();
    }

    public int getCrewSize(){
        return this.pirates.size();
    }

    public ArrayList<String> getPoorPirates(){
        for(Pirate pirate : this.pirates){
            if(pirate.getHasWoodenLeg() && pirate.getGoldAmount() < 15){
                this.poorPirates.add(pirate.getName());
            }
        }
        return this.poorPirates;
    }

    public int getGolds(){
        int sumOfGold = 0;
        for(Pirate pirate : this.pirates){
            sumOfGold += pirate.getGoldAmount();
        }
        return sumOfGold;
    }

    public void lastDayOnTheShip(){
        for(Pirate pirate : this.pirates){
            pirate.party();
        }
    }
}
