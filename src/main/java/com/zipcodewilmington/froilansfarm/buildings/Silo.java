package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Egg;
import com.zipcodewilmington.froilansfarm.field.Corn;
import com.zipcodewilmington.froilansfarm.field.Squash;
import com.zipcodewilmington.froilansfarm.field.Tomato;

import java.util.ArrayList;
import java.util.Arrays;

public class Silo {

    public static ArrayList<Corn> arrListCorn = new ArrayList<Corn>();
    public static ArrayList<Tomato> arrListTomato = new ArrayList<Tomato>();
    public static ArrayList<Squash> arrListSquash = new ArrayList<Squash>();
    public static ArrayList<Egg> arrListEgg = new ArrayList<Egg>();


    public static ArrayList<Corn> getArrListCorn() {
        return arrListCorn;
    }

    public static ArrayList<Tomato> getArrListTomato() {
        return arrListTomato;
    }

    public static ArrayList<Squash> getArrListSquash() {
        return arrListSquash;
    }

    public static ArrayList<Egg> getArrListEgg() {
        return arrListEgg;
    }
}
