package org.example;

import org.junit.jupiter.api.Test;
import stringparser.InputParser;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverIntegrationTest {


    @Test
    void testRover1FinalPosition() {
        String[] input = {
                "5 5",
                "1 2 N",
                "LMLMLMLMM",

        };
        Plateau plateau = InputParser.parsePlateau(input[0]);
        Position rover1Position = InputParser.parsePosition(input[1]);
        Instruction[] rover1Instructions = InputParser.parseInstructions(input[2]);
        Rover rover1 = new Rover(rover1Position, plateau);

        plateau.addRover(rover1);
        for (Instruction instruction : rover1Instructions) {
            rover1.rotate(instruction.name().charAt(0));
        } System.out.println("Final position: " + rover1.getPosition());
        assertEquals("1, 3, N", rover1.getPosition().toString());
    }
    @Test
    void testRover2FinalPosition(){
        String[] input = {
                "5 5",
                "3 3 E",
                "MMRMMRMRRM"
        };
        Plateau plateau = InputParser.parsePlateau(input[0]);
        Position rover2Position = InputParser.parsePosition(input[1]);
        Instruction[] rover2Instructions = InputParser.parseInstructions(input[2]);
        Rover rover2 = new Rover(rover2Position, plateau);

        plateau.addRover(rover2);
        for (Instruction instruction : rover2Instructions) {
            rover2.rotate(instruction.name().charAt(0));
        }
        System.out.println("Final position: " + rover2.getPosition());
         assertEquals("5, 1, E", rover2.getPosition().toString());
    }

    @Test
    void testRover1OutOfBoundsInstruction(){
        String[] input = {
                "5 5",
                "0 0 N",      // rover 1 initial position
                "MMMMMMMMMM"  // rover 1 moves out of bounds
        };
        Plateau plateau = InputParser.parsePlateau(input[0]);
        Position rover1Position = InputParser.parsePosition(input[1]);
        Instruction[] roverInstructions = InputParser.parseInstructions(input[2]);
        Rover rover1 = new Rover(rover1Position, plateau);

        plateau.addRover(rover1);
        for (Instruction instruction : roverInstructions) {
            rover1.rotate(instruction.name().charAt(0));
        } System.out.println("Final position: " + rover1.getPosition());
        assertEquals("0, 5, N", rover1.getPosition().toString()); // should only move within bounds
    }

    @Test
    void testRover2OutOfBoundsInstruction() {
        String[] input = {
                "5 5",
                "0 0 N",      // rover 2 initial position
                "MMMMMMMMMM"  // rover 2 moves out of bounds
        };
        Plateau plateau = InputParser.parsePlateau(input[0]);
        Position rover2Position = InputParser.parsePosition(input[1]);
        Instruction[] roverInstructions = InputParser.parseInstructions(input[2]);
        Rover rover2 = new Rover(rover2Position, plateau);

        plateau.addRover(rover2);
        for (Instruction instruction : roverInstructions) {
            rover2.rotate(instruction.name().charAt(0));
        } System.out.println("Final position: " + rover2.getPosition());
        assertEquals("0, 5, N", rover2.getPosition().toString()); // should only move within bounds

    }


}