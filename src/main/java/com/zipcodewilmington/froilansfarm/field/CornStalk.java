package com.zipcodewilmington.froilansfarm.field;

import java.util.ArrayList;

public class CornStalk extends Crop{
    Corn corn;

    public CornStalk(){
       corn = new Corn();
    }


   public Corn yield() {
        return corn;
    }
}
