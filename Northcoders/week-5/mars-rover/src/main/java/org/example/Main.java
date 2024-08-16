package org.example;

import stringparser.InputParser;

public class Main {


    public static void main(String[] args) {

        //InputParser.parseCompassDirection("B");
        //InputParser.parseInstructions("LRU");

        Plateau plateau = new Plateau(5,5);

        Rover rover1 = new Rover(new Position(1, 1, CompassDirection.N), plateau);
        plateau.addRover(rover1);

    }
}