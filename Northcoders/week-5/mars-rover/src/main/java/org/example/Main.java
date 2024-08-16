package org.example;

import stringparser.InputParser;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


                String[] input = {
                        "5 5",        // Plateau size, input[0]
                        "1 2 N",      // initial position of rover 1, input [1]
                        "LMLMLMLMM",  // rover 1 instruction, input [2]
                        "3 3 E",      // rover 2 initial position. input [3]
                        "MMRMMRMRRM"  // rover 2 instructions, input [4]
                };

        // make new plateau object and parse size
        Plateau plateau = InputParser.parsePlateau(input[0]);

        // parse rover 1 position and instructions
        Position rover1Position = InputParser.parsePosition(input[1]);
        Instruction[] rover1Instructions = InputParser.parseInstructions(input[2]);
        Rover rover1 = new Rover(rover1Position, plateau);

        // add rover 1 to the plateau and move it according to instructions
        plateau.addRover(rover1);
        for (Instruction instruction : rover1Instructions) { // iterate through all the chars
            rover1.rotate(instruction.name().charAt(0));  // .name returns enum value as string - charAt gets value of string to evoke rotate method
        }

        // parse rover 2 position and instructions
        Position rover2Position = InputParser.parsePosition(input[3]);
        Instruction[] rover2Instructions = InputParser.parseInstructions(input[4]);
        Rover rover2 = new Rover(rover2Position, plateau);

        // add rover 2 to the plateau and move it according to instructions
        plateau.addRover(rover2);
        for (Instruction instruction : rover2Instructions) {
            rover2.rotate(instruction.name().charAt(0));
        }

        // positions of the rovers
        System.out.println("Final position of Rover 1: " + rover1.getPosition());
        System.out.println("Final position of Rover 2: " + rover2.getPosition());
    }
}