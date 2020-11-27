package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.vehicle.Vehicle;

public interface Rider {
    Boolean mountHorse(Horse horse);
    Boolean dismountHorse(Horse horse);
    Boolean mountVehicle(Vehicle vehicle);
    Boolean dismountVehicle(Vehicle vehicle);

}
