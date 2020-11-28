package com.zipcodewilmington.froilansfarm.field;


public class TomatoPlant extends Crop{

    Tomato tomato;

    public TomatoPlant(){

        tomato = new Tomato();
        setFertilized(false);
        setPlanted(false);
        setHarvested(true);
    }


    public Tomato yield() {
        return tomato;
    }
}

