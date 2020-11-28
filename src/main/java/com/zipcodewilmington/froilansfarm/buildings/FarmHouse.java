package com.zipcodewilmington.froilansfarm.buildings;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.people.Pilot;

import java.util.ArrayList;

public class FarmHouse {

    ArrayList<Person> people;

    public FarmHouse() {
        Farmer farmer = new Farmer();
        Pilot pilot = new Pilot();
        people = new ArrayList<Person>();
        people.add(farmer);
        people.add(pilot);
    }

    public ArrayList<Person> getPeople() {
        return people;
    }
}



