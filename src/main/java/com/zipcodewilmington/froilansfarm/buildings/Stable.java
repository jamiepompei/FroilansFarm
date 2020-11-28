package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Horse;

import java.util.ArrayList;

public class Stable {
    ArrayList<Horse> horses;

    public Stable(Integer numOfHorses) {
        horses = new ArrayList<Horse>();
        for (int i = 1; i <= numOfHorses; i++) {
            horses.add(new Horse());
        }
    }
    public ArrayList<Horse> getHorses() {
        return horses;
    }
}
