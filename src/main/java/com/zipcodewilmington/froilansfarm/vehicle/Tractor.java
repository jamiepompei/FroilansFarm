package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.buildings.Farm;
import com.zipcodewilmington.froilansfarm.buildings.Silo;
import com.zipcodewilmington.froilansfarm.field.*;

public class Tractor extends FarmVehicle{
    Boolean isBeingRidden;


    public Tractor(){
        isBeingRidden = false;
    }


    public String makeNoise() {
        return "Obnoxious noise.. crunch munch!!";
    }

    public Boolean getIsBeingRidden() {
        return isBeingRidden;
    }

    public void setIsBeingRidden(Boolean isBeingRidden) {
        this.isBeingRidden= isBeingRidden;

    }
    public void harvest(Integer rowNum, Farm farm) {

        for (Crop c : farm.getField().getRows().get(rowNum - 1).getListOfCrop()
        ) {
            if (c.getFertilized()) {
                c.setPlanted(false);
                c.setHarvested(true);
            }

            switch (rowNum){
                case 1: Silo.arrListCorn.add(new Corn());
                break;

                case 2: Silo.arrListTomato.add(new Tomato());
                break;

                case 3:
                case 4:
                case 5: Silo.arrListSquash.add(new Squash());
                break;
            }
        }
    }
}
