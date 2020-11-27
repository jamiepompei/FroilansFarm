package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.buildings.Silo;
import com.zipcodewilmington.froilansfarm.interfaces.Flyer;

public class Pilot extends Person  {

    private String name;

    public Pilot(){
        this.name = "Froilanda";
    }


    public String getName() {
        return name;
    }

    @Override
    public String eat() {
        Silo.getArrListTomato().remove(Silo.getArrListTomato().size()-1);

        for(int i=0; i<2; i++){
            Silo.getArrListCorn().remove(Silo.getArrListCorn().size()-1);
            Silo.getArrListEgg().remove(Silo.getArrListEgg().size()-1);
        }

        return "Stuffed!";
    }
}
