package com.company;

/**
 * Created by raphael on 3/18/15.
 */
public class Logic {


    final double KILO = 1000;
    final double HECTO = 100;
    final double DEKA = 10;
    final double BASE = 1;
    final double CENTI = 0.01;
    final double MILLI = 0.001;


    public void converter(double val, String initUnit, String finalUnit) {
        //sets all required units. Staging area.
        double convertedVal = 0;

        //converts the val to its base unit.

        if (initUnit.contains("k")){
            convertedVal = val * KILO;
        } else if (initUnit.contains("h")){
            convertedVal = val * HECTO;
        } else if (initUnit.contains("da")){
            convertedVal = val * DEKA;
        } else if (initUnit.contains("c")){
            convertedVal = val * CENTI;
        } else if (initUnit.contains("m")){
            convertedVal = val * MILLI;
        }

        convert(convertedVal, finalUnit); //sends value (converted to base unit to method to convert change to unit desired)
    }

    private void convert(double val, String finalUnit) {
        //converts to final unit
        double finalVal = 0;


        if (finalUnit.contains("k")){
            finalVal = val / KILO;
        } else if (finalUnit.contains("h")){
            finalVal = val / HECTO;
        } else if (finalUnit.contains("da")){
            finalVal = val / DEKA;
        } else if (finalUnit.contains("c")){
            finalVal = val / CENTI;
        } else if (finalUnit.contains("m")){
            finalVal = val / MILLI;
        }

        System.out.println(finalVal + " " + finalUnit);
        //so far works for upper conversions, but not for lower conversions
    }
}


