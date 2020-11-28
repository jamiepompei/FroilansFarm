package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Egg implements Edible {
    Boolean isFertilized = false;

    public Egg(){};

    public Boolean getFertilized() {
        return isFertilized;
    }
}
