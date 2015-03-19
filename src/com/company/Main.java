package com.company;

public class Main {

    /**
     * Unit Converter (temp, currency, volume, mass and more) – Converts various units between one another.
     * The user enters the type of unit being entered, the type of unit they want to convert to and then the value.
     * The program will then make the conversion.
     * @param args
     */

    private static int value;
    private static String initialUnit;
    private static String finalUnit;

    public static void main(String[] args) {
        /*
        * asks user for information regarding the val and unit to be converted.
        * */

        Main main = new Main();

        //program starts with declaration of classes within itself. Mainly the UI class (TextUI) and the class
        //that handles all the logic and numbers within the program.

        UI textUI = new UI(); //to serve as the place to receive all user interface
        Logic logic = new Logic(); //to serve as the class to convert all units to other units and variables.

        textUI.askValues(); //method that starts the program with the starting user values. (see askValues())

        //back from askValues() program now has all the variables filled in order to proceed, at this point the program
        //will send that information to the logic class and use given information to convert information.

        //System.out.println(main.getValue() + "\n" + initialUnit + "\n" + finalUnit);

        int userVal = main.getValue();
        String initUnit = main.getInitialUnit(), finUnit = main.getFinalUnit();

        logic.converter(userVal, initUnit, finUnit); //start for logic machine uses the 3 vars already defined.
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getInitialUnit() {
        return initialUnit;
    }

    public void setInitialUnit(String initialUnit) {
        this.initialUnit = initialUnit;
    }

    public String getFinalUnit() {
        return finalUnit;
    }

    public void setFinalUnit(String finalUnit) {
        this.finalUnit = finalUnit;
    }
}
