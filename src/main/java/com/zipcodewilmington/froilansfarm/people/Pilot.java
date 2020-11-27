package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Flyer;

public class Pilot extends Person implements Flyer {

    private String name;

    public Pilot(){
        this.name = "Froilanda";
    }

    public void fly() {
    }

    public String getName() {
        return name;
    }
}
