package com.zipcodewilmington.froilansfarm.field;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CropRow {

    ArrayList<Crop>  listOfCrop;


    public CropRow(Crop crop){
        listOfCrop = new ArrayList<Crop> (Arrays.asList(crop, crop, crop, crop, crop));
    }


    public ArrayList<Crop> getListOfCrop() {
        return listOfCrop;
    }
}
