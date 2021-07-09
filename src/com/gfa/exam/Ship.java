package com.gfa.exam;

import java.util.ArrayList;

public class Ship {
    private ArrayList<Pirate> pirates;

    public Ship() {
        this.pirates = new ArrayList<>();
    }

    public int getCrewSize(){
        return this.pirates.size();
    }
}
