package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.buildings.Silo;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

import java.util.ArrayList;

public class Chicken extends Animal implements Produce {

    public String eat() {
        Silo.getArrListCorn().remove(Silo.getArrListCorn().size()-1);
        return "bok bok";
    }

    public String makeNoise() {
        return "Cluk cluk";
    }

    public Object yield() {
     Silo.arrListEgg.add(new Egg());
    return new Egg();
    }


}
