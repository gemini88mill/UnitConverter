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

        if (initUnit.startsWith("k")){
            convertedVal = val * KILO;
        } else if (initUnit.startsWith("h")){
            convertedVal = val * HECTO;
        } else if (initUnit.startsWith("da")){
            convertedVal = val * DEKA;
        } else if (initUnit.startsWith("c")){
            convertedVal = val * CENTI;
        } else if (initUnit.startsWith("m")){
            convertedVal = val * MILLI;
        }

        convert(convertedVal, finalUnit); //sends value (converted to base unit to method to convert change to unit desired)
    }

    private void convert(double val, String finalUnit) {
        //converts to final unit
        double finalVal = 0;


        if (finalUnit.startsWith("k")){
            finalVal = val / KILO;
        } else if (finalUnit.startsWith("h")){
            finalVal = val / HECTO;
        } else if (finalUnit.startsWith("da")){
            finalVal = val / DEKA;
        } else if (finalUnit.startsWith("c")){
            finalVal = val / CENTI;
        } else if (finalUnit.startsWith("m")){
            finalVal = val / MILLI;
        }

        System.out.println(finalVal + " " + finalUnit);
        //so far works for upper conversions, but not for lower conversions
    }

    private void revisedConverter(){
        double val = 40;
        String init = "kg";
        String toConverted = "mg";

        if (init.startsWith("k")){
            val = (val / KILO) * (MILLI);
        }
    }
}


