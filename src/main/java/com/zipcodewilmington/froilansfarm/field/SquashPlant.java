package com.zipcodewilmington.froilansfarm.field;

import java.util.ArrayList;

public class SquashPlant extends Crop{

    Squash squash;

    public SquashPlant(){
        squash = new Squash();
    }


    public Squash yield() {
        return squash;
    }

}
