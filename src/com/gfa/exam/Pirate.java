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

    public boolean getHasWoodenLeg(){
        return this.hasWoodenLeg;
    }

    public boolean isCaptain(){
        return this.captain;
    }

    // increase amount of gold and healthpoints
    public void work(){
        if(this.isCaptain()) {
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
        if(this.isCaptain()) {
            this.healthPoints += 10;
        } else {
            this.healthPoints += 1;
        }
    }

    @Override
    public String toString() {
        if(this.getHasWoodenLeg()) {
            return "Hello I'm " + this.getName() + ". " + "I have a wooden leg and " +
                    this.getGoldAmount() + " golds";
        } else {
            return "Hello I'm " + this.getName() + ". " + "I still have my real legs and " +
                    this.getGoldAmount() + " golds";
        }
    }
}
