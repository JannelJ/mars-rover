package stringparser;

import org.example.CompassDirection;
import org.example.Instruction;
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
}

