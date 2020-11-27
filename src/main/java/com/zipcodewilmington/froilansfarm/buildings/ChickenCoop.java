package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;

import java.util.ArrayList;

public class ChickenCoop {

    ArrayList<Chicken> chickens;

    public ChickenCoop(Integer numOfChickens) {
        chickens = new ArrayList<Chicken>();
        for (int i = 1; i <= numOfChickens; i++) {
            chickens.add(new Chicken());
        }
    }
    public ArrayList<Chicken> getChickens() {
        return chickens;
    }
}
