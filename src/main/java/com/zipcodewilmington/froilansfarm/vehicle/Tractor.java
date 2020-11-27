package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.field.Crop;
import com.zipcodewilmington.froilansfarm.field.Field;

public class Tractor extends FarmVehicle{
    Boolean isBeingRidden;
    Field field;

    public String makeNoise() {
        return "Obnoxious noise.. crunch munch!!";
    }

    public Boolean getIsBeingRidden() {
        return isBeingRidden;
    }

    public void setIsBeingRidden(Boolean isBeingRidden) {

    }
    public void harvest(Integer rowNum) {

        for (Crop c : field.getRows().get(rowNum - 1).getListOfCrop()
        ) {
            if (c.getFertilized()) {
                c.setPlanted(false);
                c.setHarvested(true);
            }
        }
    }



}
