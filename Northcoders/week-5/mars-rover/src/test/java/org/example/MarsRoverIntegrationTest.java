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
                "3 3 E",
                "MMRMMRMRRM"
        };
        Plateau plateau = InputParser.parsePlateau(input[0]);
        Position rover1Position = InputParser.parsePosition(input[1]);
        Instruction[] rover1Instructions = InputParser.parseInstructions(input[2]);
        Rover rover1 = new Rover(rover1Position, plateau);
        plateau.addRover(rover1);
        for (Instruction instruction : rover1Instructions) {
            rover1.rotate(instruction.name().charAt(0));
        }
        assertEquals("1, 3, N", rover1.getPosition().toString());
    }
    @Test
    void testRover2FinalPosition(){
        String[] input = {
                "5 5",
                "1 2 N",
                "LMLMLMLMM",
                "3 3 E",
                "MMRMMRMRRM"
        };
        Plateau plateau = InputParser.parsePlateau(input[0]);
        Position rover2Position = InputParser.parsePosition(input[3]);
        Instruction[] rover2Instructions = InputParser.parseInstructions(input[4]);
        Rover rover2 = new Rover(rover2Position, plateau);
        plateau.addRover(rover2);
        for (Instruction instruction : rover2Instructions) {
            rover2.rotate(instruction.name().charAt(0));
        }
        assertEquals("5, 1, E", rover2.getPosition().toString());
    }



}