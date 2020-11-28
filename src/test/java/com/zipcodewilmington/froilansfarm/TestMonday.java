package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.buildings.Farm;
import com.zipcodewilmington.froilansfarm.buildings.Silo;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import org.junit.Before;
import org.junit.Test;

public class TestMonday {
    //Breakfast- test for eat-string output
    //Froilanda - use the cropduster to fly and fertilize stuff

    Farm farm;
    Farmer Froilan;
    Pilot Froilanda;


    @Before
    public void setup() {
        farm = new Farm();
        Silo.addFood();
        Froilan = new Farmer();
        Froilanda = new Pilot();
        Froilan.plant(1, farm);
        Froilan.plant(2, farm);
        Froilan.plant(3, farm);
    }




}
