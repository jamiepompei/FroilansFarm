package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.vehicle.Vehicle;

public class Person implements Rider, Eater {


    public String eat() {
        return "So full!";
    }

    public void ride() {

    }

    public Boolean mountHorse(Horse horse) {

        if(!horse.getIsBeingRidden()){
            horse.setIsBeingRidden(true);
            return true;
        }
        return false;
    }

    public Boolean dismountHorse(Horse horse) {
        if(horse.getIsBeingRidden()){
            horse.setIsBeingRidden(false);
            return true;
        }
        return false;
    }

    public Boolean mountVehicle(Vehicle vehicle) {
        if(!vehicle.getIsBeingRidden()){
            vehicle.setIsBeingRidden(true);
            return true;
        }
        return false;

    }

    public Boolean dismountVehicle(Vehicle vehicle) {
        if(vehicle.getIsBeingRidden()){
            vehicle.setIsBeingRidden(false);
            return true;
        }
        return false;
    }
}
