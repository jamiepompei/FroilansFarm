package com.zipcodewilmington.froilansfarm.field;

import java.util.ArrayList;

public class CornStalk extends Crop{
    Corn corn;

    public CornStalk(){
        setFertilized(false);
        setPlanted(false);
        setHarvested(true);
        corn = new Corn();
    }

   public Corn yield() {
        return corn;
    }
}
