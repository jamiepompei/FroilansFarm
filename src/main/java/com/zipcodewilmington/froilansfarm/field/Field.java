package com.zipcodewilmington.froilansfarm.field;

import java.util.ArrayList;

public class Field {
    ArrayList<CropRow> rows;

    public Field(){
        rows = new ArrayList<CropRow>(5);
        CropRow cropRow1 = new CropRow(new CornStalk());
        CropRow cropRow2 = new CropRow(new TomatoPlant());
        CropRow cropRow3 = new CropRow(new SquashPlant());
        CropRow cropRow4 = new CropRow(new SquashPlant());
        CropRow cropRow5 = new CropRow(new SquashPlant());

        rows.add(cropRow1);
        rows.add(cropRow2);
        rows.add(cropRow3);
        rows.add(cropRow4);
        rows.add(cropRow5);
    }

}
