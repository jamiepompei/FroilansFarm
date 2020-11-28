package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.buildings.Farm;
import com.zipcodewilmington.froilansfarm.buildings.Silo;
import com.zipcodewilmington.froilansfarm.buildings.Stable;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestThursday {
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
        Froilan.plant(4, farm);
        Froilan.plant(5, farm);

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
    public void testRideTheHorses() {

        for (Stable stable : farm.getStable()) {
            for (Horse horse : stable.getHorses()) {
                Froilan.mountHorse(horse);
                Assert.assertTrue(horse.getIsBeingRidden());
                Froilan.dismountHorse(horse);
                Assert.assertFalse(horse.getIsBeingRidden());
            }
        }
    }

    @Test
    public void testFeedHorses() {
        Integer expectedSizeCorn = Silo.getArrListCorn().size() - 30;
        for (Stable stable : farm.getStable()) {
            for (Horse horse : stable.getHorses()) {
                horse.eat();
            }
        }
        Integer actualSizeCorn = Silo.getArrListCorn().size();
        Assert.assertEquals(expectedSizeCorn, actualSizeCorn);
    }


}
