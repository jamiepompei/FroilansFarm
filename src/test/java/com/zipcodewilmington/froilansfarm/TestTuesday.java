package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.buildings.Farm;
import com.zipcodewilmington.froilansfarm.buildings.Silo;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTuesday {
    Farm farm;
    Farmer Froilan;
    Pilot Froilanda;
    CropDuster cropDuster;
    Tractor tractor;

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
        cropDuster = farm.getCropDuster();
        cropDuster.fertilize(1, farm);
        cropDuster.fertilize(2, farm);
        cropDuster.fertilize(3, farm);
        cropDuster.fertilize(4, farm);
        cropDuster.fertilize(5, farm);
        tractor = farm.getTractor();
    }

    @Test
    public void testGetFarmerName() {
        setup();
        String expected = "Froilan";
        String actual = Froilan.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetPilotName() {
        setup();
        String expected = "Froilanda";
        String actual = Froilanda.getName();
        Assert.assertEquals(expected, actual);
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
    public void harvest() {
        setup();
        Boolean expected1 = true;
        Boolean expected2 = true;
        Boolean expected3 = true;
        Boolean expected4 = true;
        Boolean expected5 = true;
        tractor.harvest(1, farm);
        tractor.harvest(2, farm);
        tractor.harvest(3, farm);
        tractor.harvest(4, farm);
        tractor.harvest(5, farm);
        Boolean actual1 = farm.getField().getRows().get(0).getListOfCrop().get(0).getHarvested();
        Boolean actual2 = farm.getField().getRows().get(1).getListOfCrop().get(0).getHarvested();
        Boolean actual3 = farm.getField().getRows().get(2).getListOfCrop().get(0).getHarvested();
        Boolean actual4 = farm.getField().getRows().get(3).getListOfCrop().get(0).getHarvested();
        Boolean actual5 = farm.getField().getRows().get(4).getListOfCrop().get(0).getHarvested();
        Assert.assertEquals(expected1, actual1);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
        Assert.assertEquals(expected5, actual5);
    }

    @Test
    public void testIsBeingRidden() {
        setup();
        Froilan.mountVehicle(tractor);
        Assert.assertTrue(tractor.getIsBeingRidden());
        Froilan.dismountVehicle(tractor);
        Assert.assertFalse(tractor.getIsBeingRidden());
    }

    @Test
    public void testFeedChickens() {
        setup();
        Integer expectedSizeCorn = Silo.getArrListCorn().size() - 15;
        for (ChickenCoop chickenCoop : farm.getChickenCoop()) {
            for (Chicken chicken : chickenCoop.getChickens()) {
                chicken.eat();
            }
        }
        Integer actualSizeCorn = Silo.getArrListCorn().size();
        Assert.assertEquals(expectedSizeCorn, actualSizeCorn);
    }

    @Test
    public void testChickensSpeak() {
        setup();
        String expected = "Cluk cluk";
        String actual = farm.getChickenCoop().get(0).getChickens().get(0).makeNoise();
        Assert.assertEquals(expected, actual);
    }
}
