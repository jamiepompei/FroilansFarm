package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.buildings.Silo;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

import java.util.ArrayList;

public class Chicken extends Animal implements Produce {
    Silo silo;


    public String eat() {
        silo.getArrListCorn().remove(0);
        return "bok bok";
    }

    public String makeNoise() {
        return "Cluk cluk";
    }

    public Object yield() {
        return new Egg();
    }
}
