package stringparser;

import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {


    @Test
    void instructionsValidInput() {
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
    void instructionsInvalidInput() {
        String input = "U";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            InputParser.parseInstructions(input);
        });
        assertEquals("Input must only contain L, R, or M", exception.getMessage());
    }

    @Test
    void instructionsEmptyInput() {
        String input = "";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            InputParser.parseInstructions(input);
        });
        assertEquals("Input cannot be empty", exception.getMessage());
    }

    @Test
    void instructionsNullInput(){
        String input = null;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            InputParser.parseInstructions(null);
        });
        assertEquals("Input cannot be empty", exception.getMessage());

    }

    @Test
    void instructionWithoutM(){
        String input= "LLRR";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            InputParser.parseInstructions(input);
        });
        assertEquals("Instruction must include a move argument", exception.getMessage());
    }


    @Test
    void compassDirectionValidInput() {
    String input = "N";
        CompassDirection expected = CompassDirection.N;
        CompassDirection actual = InputParser.parseCompassDirection(input);
        assertEquals(expected, actual);
    }

    @Test
    void compassDirectionInvalidInput() {
        String input = "B";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            InputParser.parseCompassDirection(input);
                });
        assertEquals("Input must only contain E, N, S, or W", exception.getMessage());
    }

    @Test
    void compassDirectionEmptyInput() {
        String input = "";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            InputParser.parseCompassDirection(input);
        });
        assertEquals("Input cannot be empty", exception.getMessage());
    }

    @Test
    void compassDirectionNullInput() {
        String input = null;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            InputParser.parseCompassDirection(null);
        });
        assertEquals("Input cannot be empty", exception.getMessage());

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

