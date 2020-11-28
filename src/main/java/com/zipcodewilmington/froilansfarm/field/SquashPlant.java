package com.zipcodewilmington.froilansfarm.field;

import java.util.ArrayList;

public class SquashPlant extends Crop{

    Squash squash;

    public SquashPlant(){
        squash = new Squash();
        setFertilized(false);
        setPlanted(false);
        setHarvested(true);
    }


    public Squash yield() {
        return squash;
    }

}
