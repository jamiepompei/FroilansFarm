package com.zipcodewilmington.froilansfarm.field;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {
    Boolean isFertilized;
    Boolean isPlanted;

    public Boolean getFertilized() {
        return isFertilized;
    }

    public void setFertilized(Boolean fertilized) {
        isFertilized = fertilized;
    }

    public Boolean getPlanted() {
        return isPlanted;
    }

    public void setPlanted(Boolean planted) {
        isPlanted = planted;
    }
}
