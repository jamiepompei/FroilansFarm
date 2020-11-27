package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Botanist;

public class Farmer extends Person implements Botanist {
    private String name;

    public Farmer(){
       this.name = "Froilan";
    }

    public void plant() {

    }
    public String getName() {
        return name;
    }
}
