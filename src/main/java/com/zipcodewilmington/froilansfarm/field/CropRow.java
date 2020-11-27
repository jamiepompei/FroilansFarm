package com.zipcodewilmington.froilansfarm.field;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CropRow {

    ArrayList<Crop>  listOfCrop;
    Boolean isFertilized;
    Boolean isPlanted;

    Boolean checkIfSeeded(Integer rowNum){
        return false;
    }

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
