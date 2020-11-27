package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.field.Crop;
import com.zipcodewilmington.froilansfarm.field.Field;
import com.zipcodewilmington.froilansfarm.interfaces.Flyer;

public class CropDuster extends FarmVehicle implements Flyer {
    Boolean isFlying;
    Boolean isBeingRidden;
    Field field;

    public void fly() {    //is flying
        if (getIsBeingRidden()) {
            isFlying = true;
        }
    }

    public void land() {  //is already landed
            isFlying = false;

    }

    public String makeNoise() {
        return "Annoyingly loud engine noisessss!!!";
    }

    public Boolean getIsBeingRidden() {

        return isBeingRidden;
    }

    public void setIsBeingRidden(Boolean isBeingRidden) {
        this.isBeingRidden = isBeingRidden;
    }

    public void fertilize(Integer rowNum){
        for (Crop c : field.getRows().get(rowNum - 1).getListOfCrop()
        ) {
            if (c.getPlanted()) {
                c.setFertilized(true);
            }
        }

    }

}
