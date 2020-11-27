package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Person implements Rider, Eater {



    public String eat() {

        return "So full!";
    }

    public void ride() {

    }

    public Boolean mount() {
        return null;
    }

    public Boolean dismount() {
        return null;
    }
}
