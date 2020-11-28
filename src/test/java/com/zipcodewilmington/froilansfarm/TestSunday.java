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

public class TestSunday {
    Farm farm;
    Farmer Froilan;
    Pilot Froilanda;


    @Before
    public void setup() {
        farm = new Farm();
        Silo.addFood();
        Froilan = new Farmer();
        Froilanda = new Pilot();
    }


    @Test
    public void testFroilanBreakfast() {
        setup();

        Integer expectedSizeTomato = Silo.getArrListTomato().size() - 2;
        Integer expectedSizeCorn = Silo.getArrListCorn().size() - 1;
        Integer expectedSizeEggs = Silo.getArrListEgg().size() - 5;
        Froilan.eat();
        Integer actualSizeTomato = Silo.getArrListTomato().size();
        Integer actualSizeCorn = Silo.getArrListCorn().size();
        Integer actualSizeEggs = Silo.getArrListEgg().size();
        Assert.assertEquals(expectedSizeTomato, actualSizeTomato);
        Assert.assertEquals(expectedSizeCorn, actualSizeCorn);
        Assert.assertEquals(expectedSizeEggs, actualSizeEggs);

    }


    @Test
    public void testFroilandaBreakfast() {
        setup();

        Integer expectedSizeTomato = Silo.getArrListTomato().size() - 1;
        Integer expectedSizeCorn = Silo.getArrListCorn().size() - 2;
        Integer expectedSizeEggs = Silo.getArrListEgg().size() - 2;
        Froilanda.eat();
        Integer actualSizeTomato = Silo.getArrListTomato().size();
        Integer actualSizeCorn = Silo.getArrListCorn().size();
        Integer actualSizeEggs = Silo.getArrListEgg().size();
        Assert.assertEquals(expectedSizeTomato, actualSizeTomato);
        Assert.assertEquals(expectedSizeCorn, actualSizeCorn);
        Assert.assertEquals(expectedSizeEggs, actualSizeEggs);

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
    public void testHorseSpeak() {
        String expected = "Naaaay!!";
        String actual = farm.getStable().get(0).getHorses().get(0).makeNoise();
        Assert.assertEquals(expected, actual);
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

    @Test
    public void testPlant() {

        Boolean expected1 = true;
        Boolean expected2 = true;
        Boolean expected3 = true;
        Boolean expected4 = true;
        Boolean expected5 = true;

        Froilan.plant(1, farm);
        Froilan.plant(2, farm);
        Froilan.plant(3, farm);
        Froilan.plant(4, farm);
        Froilan.plant(5, farm);

        Boolean actual1 = farm.getField().getRows().get(0).getListOfCrop().get(0).getPlanted();
        Boolean actual2 = farm.getField().getRows().get(1).getListOfCrop().get(0).getPlanted();
        Boolean actual3 = farm.getField().getRows().get(2).getListOfCrop().get(0).getPlanted();
        Boolean actual4 = farm.getField().getRows().get(3).getListOfCrop().get(0).getPlanted();
        Boolean actual5 = farm.getField().getRows().get(4).getListOfCrop().get(0).getPlanted();

        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
        Assert.assertEquals(expected5, actual5);

    }
}