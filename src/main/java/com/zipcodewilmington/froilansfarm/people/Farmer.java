package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.field.Crop;
import com.zipcodewilmington.froilansfarm.field.Field;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;

public class Farmer extends Person implements Botanist {
    private String name;
    Field field;


    public Farmer(){
       this.name = "Froilan";
    }

    public String getName() {
        return name;
    }

    public void plant(Integer rowNum) {

        if(field.getRows().get(rowNum-1).getListOfCrop().get(0).getHarvested()){
            field.getRows().get(rowNum-1).getListOfCrop().get(0).setPlanted(true);
        }
    }
}