package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.field.Field;

import java.util.ArrayList;
import java.util.Arrays;

public class Farm {
    private ArrayList<ChickenCoop> chickenCoop;
    private ArrayList<Stable> stable;
    private Field field;
    private FarmHouse farmHouse;
    private Silo silo;


    public Farm(){
        ChickenCoop[] tempChickens = {new ChickenCoop(4), new ChickenCoop(4),
                                new ChickenCoop(4), new ChickenCoop(3)};
        chickenCoop = new ArrayList<ChickenCoop>(Arrays.asList(tempChickens));

        Stable[] tempHorses = {new Stable(3), new Stable(3), new Stable(4)};
        stable = new ArrayList<Stable>(Arrays.asList(tempHorses));

        field = new Field();
        farmHouse = new FarmHouse();
        silo = new Silo();
    }

    public ArrayList<ChickenCoop> getChickenCoop() {
        return chickenCoop;
    }

    public ArrayList<Stable> getStable() {
        return stable;
    }

    public Field getField() {
        return field;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public Silo getSilo() {
        return silo;
    }
}
