package stringparser;

import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {


    @Test
    void parseInstructionsValidInput() {
       String input = "LRMMRM";
        Instruction[] expected = {
                Instruction.L,
                Instruction.R,
                Instruction.M,
                Instruction.M,
                Instruction.R,
                Instruction.M };
        Instruction[] actual = InputParser.parseInstructions(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void parseInstructionsInvalidInput() {
        String input = "LRU";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            InputParser.parseInstructions(input);
        });
        assertEquals("No enum constant org.example.Instruction.U", exception.getMessage());
    }


    @Test
    void parseCompassDirection_ValidInput() {
    String input = "N";
        CompassDirection expected = CompassDirection.N;
        CompassDirection actual = InputParser.parseCompassDirection(input);
        assertEquals(expected, actual);
    }

    @Test
    void parseCompassDirection_InvalidInput() {
        String input = "B";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            InputParser.parseCompassDirection(input);
                });
        assertEquals("No enum constant org.example.CompassDirection.B", exception.getMessage());
    }
    @Test
    void addRoverOutOfBounds() {
        Plateau plateau = new Plateau(5,5);
        Position outOfBoundsPosition = new Position(6,7, CompassDirection.N);
        Rover roverOutOfBounds = new Rover(outOfBoundsPosition, plateau);
        plateau.addRover(roverOutOfBounds);
        assertEquals(0, plateau.getRovers().size());
    }
    @Test
    void addValidRover(){
            Plateau plateau = new Plateau(5,5);
            Position validPosition = new Position(4,3, CompassDirection.N);
            Rover inBounds = new Rover(validPosition, plateau);
            plateau.addRover(inBounds);
            assertEquals(1, plateau.getRovers().size());
    }
}

