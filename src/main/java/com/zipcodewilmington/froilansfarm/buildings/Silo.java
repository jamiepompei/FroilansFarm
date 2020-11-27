package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Egg;
import com.zipcodewilmington.froilansfarm.field.Corn;
import com.zipcodewilmington.froilansfarm.field.Squash;
import com.zipcodewilmington.froilansfarm.field.Tomato;

import java.util.ArrayList;
import java.util.Arrays;

public class Silo {

    ArrayList<Corn> arrListCorn;
    ArrayList<Tomato> arrListTomato;
    ArrayList<Squash> arrListSquash;
    ArrayList<Egg> arrListEgg;

    public Silo() {

        Egg[] eggs= {new Egg(), new Egg(), new Egg(), new Egg(), new Egg(), new Egg(), new Egg(), new Egg(), new Egg(), new Egg()};
        Corn[] corns = {new Corn(),new Corn(), new Corn(), new Corn(), new Corn(), new Corn(), new Corn(), new Corn(), new Corn(), new Corn(),
                new Corn(),new Corn(), new Corn(), new Corn(), new Corn(), new Corn(), new Corn(), new Corn(), new Corn(), new Corn(),
                new Corn(),new Corn(), new Corn(), new Corn(), new Corn(), new Corn(), new Corn(), new Corn(), new Corn(), new Corn()};
        Tomato[] tomatoes = {new Tomato(), new Tomato(), new Tomato(), new Tomato(), new Tomato()};


        arrListCorn = new ArrayList<Corn>(Arrays.asList(corns));
        arrListTomato = new ArrayList<Tomato>(Arrays.asList(tomatoes));
        arrListEgg = new ArrayList<Egg>(Arrays.asList(eggs));
        arrListSquash = new ArrayList<Squash>();

    }
    public ArrayList<Corn> getArrListCorn() {
        return arrListCorn;
    }

    public ArrayList<Tomato> getArrListTomato() {
        return arrListTomato;
    }

    public ArrayList<Squash> getArrListSquash() {
        return arrListSquash;
    }

    public ArrayList<Egg> getArrListEgg() {
        return arrListEgg;
    }
}
