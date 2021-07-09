package com.gfa.exam;

import java.util.Random;

public class Pirate {
    private String name;
    private int goldAmount;
    private int healthPoints;
    private boolean hasWoodenLeg;
    private boolean captain;

    public Pirate(String name) {
        this.name = name;
        this.goldAmount = 0;
        this.healthPoints = 10;

        Random rand = new Random();
        this.hasWoodenLeg = rand.nextBoolean();
        this.captain = rand.nextBoolean();
    }

    public String getName() {
        return name;
    }

    public int getGoldAmount() {
        return goldAmount;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public boolean getHasWoodenLeg(){
        return this.hasWoodenLeg;
    }

    public boolean isCaptain(){
        return this.captain;
    }

    public void work(){
        if(isCaptain()) {
            if (this.healthPoints > 5) {
                this.goldAmount += 10;
                this.healthPoints -= 5;
            }
        } else {
            if (this.healthPoints > 1) {
                this.goldAmount += 1;
                this.healthPoints -= 1;
            }
        }
    }

    public void party(){
        if(isCaptain()) {
            this.healthPoints += 10;
        } else {
            this.healthPoints += 1;
        }
    }

    @Override
    public String toString() {
        if(getHasWoodenLeg()) {
            return "Hello I'm " + this.getName() + ". " + "I have a wooden leg and " +
                    this.getGoldAmount() + " golds";
        } else {
            return "Hello I'm " + this.getName() + ". " + "I still have my real legs and " +
                    this.getGoldAmount() + " golds";
        }
    }
}
