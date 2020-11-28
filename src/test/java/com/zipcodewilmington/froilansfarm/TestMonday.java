package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.buildings.Farm;
import com.zipcodewilmington.froilansfarm.buildings.Silo;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMonday {

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

    @Test
    public void testFroilanBreakfast() {
        setup();

        String expected = "So full!";
        String actual = Froilan.eat();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFroilandaBreakfast() {
        setup();

        String expected = "Stuffed!";
        String actual = Froilanda.eat();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testIsBeingRiden() {
        setup();
        Froilanda.mountVehicle(farm.getCropDuster());
        Assert.assertTrue(farm.getCropDuster().getIsBeingRidden());
        Froilanda.dismountVehicle(farm.getCropDuster());
        Assert.assertFalse(farm.getCropDuster().getIsBeingRidden());
    }


    @Test
    public void testCropDustSound() {
        setup();
        String expected = "Annoyingly loud engine noisessss!!!";
        String actual = farm.getCropDuster().makeNoise();
        Assert.assertEquals(expected, actual);

    }


}
