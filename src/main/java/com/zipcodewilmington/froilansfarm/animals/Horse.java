package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.buildings.Silo;
import com.zipcodewilmington.froilansfarm.interfaces.Ridable;

public class Horse extends Animal implements Ridable {
    Boolean isBeingRidden;
    Silo silo;

    public Horse() {
    }

    public String eat() {

        for (int i = 0; i <= 3; i++) {
            silo.getArrListCorn().remove(0);
        }
        return "Chomp";
    }

    public String makeNoise() {
        return "Naaaay!!";
    }

    public Boolean getIsBeingRidden() {
        return isBeingRidden;
    }

    public void setIsBeingRidden(Boolean isBeingRidden) {
        this.isBeingRidden = isBeingRidden;
    }
}
