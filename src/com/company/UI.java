package com.company;

import java.util.Scanner;

/**
 * Created by raphael on 3/18/15.
 */
public class UI {

    public void askValues() {
        //accessed from Main Class...

        Main main = new Main();

        System.out.println("enter unit value: (numbers only)");
        //go to user input method
        String userValue = userInput();
        //userValue collected in string

        main.setValue(Integer.parseInt(userValue));
        //System.out.println(main.getValue());

        //System.out.println(userValue);

        //next program will define the conversion

        System.out.println("starting unit: ");
        String startingUnit = userInput();
        //collects starting unit.

        //sets starting unit to main vars
        main.setInitialUnit(startingUnit);

        System.out.println("final unit: ");
        String finalUnit = userInput();

        //same with final unit
        main.setFinalUnit(finalUnit);

    }

    private String userInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
