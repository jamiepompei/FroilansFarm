package com.zipcodewilmington.froilansfarm.field;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {

    Boolean checkIfFertilized(){
        return false;
    }

    Boolean checkIfHarvested(){
        return false;
    }


}
