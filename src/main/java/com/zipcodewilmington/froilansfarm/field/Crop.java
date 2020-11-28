package com.zipcodewilmington.froilansfarm.field;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {
    Boolean isFertilized = false;
    Boolean isPlanted = false;
    Boolean isHarvested = false;

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

    public Boolean getHarvested() {
        return isHarvested;
    }

    public void setHarvested(Boolean harvested) {
        isHarvested = harvested;
    }
}
