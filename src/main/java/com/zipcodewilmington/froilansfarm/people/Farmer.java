package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.buildings.Silo;
import com.zipcodewilmington.froilansfarm.field.Crop;
import com.zipcodewilmington.froilansfarm.field.Field;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;

public class Farmer extends Person implements Botanist {
    private String name;
    Field field;


    public Farmer() {
        this.name = "Froilan";
    }

    public String getName() {
        return name;
    }

    public void plant(Integer rowNum) {

        for (Crop c : field.getRows().get(rowNum - 1).getListOfCrop()
        ) {
            if (c.getHarvested()) {
                c.setPlanted(true);
                c.setHarvested(false);
            }
        }
    }

    @Override
    public String eat() {
        Silo.getArrListCorn().remove(Silo.getArrListCorn().size()-1);

        for(int i=0; i<5; i++){
            Silo.getArrListEgg().remove(Silo.getArrListEgg().size()-1);
        }

        for(int i=0; i<2; i++){
            Silo.getArrListTomato().remove(Silo.getArrListTomato().size()-1);
        }

        return "So full!";
    }
}
