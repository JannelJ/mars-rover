package stringparser;

import org.example.CompassDirection;
import org.example.Instruction;
import org.example.PlateauSize;
import org.example.Position;

public class InputParser {

    // create methods for parsing the input strings

    public static PlateauSize parsePlateauSize(String plateauInput) {
        String[] parts = plateauInput.split(" ");
        int maxX = Integer.parseInt(parts[0]);
        int maxY = Integer.parseInt(parts[1]);
        return new PlateauSize(maxX, maxY);
    }

    public static Position parsePosition(String positionInput) {
        String[] parts = positionInput.split(" "); // splits string "12N" and splits into spaces
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]); // converts to integers
        CompassDirection facing = CompassDirection.valueOf(parts[2]); // converts to compass direction class
        return new Position(x, y, facing);
    }

    public static CompassDirection parseCompassDirection(String directionInput) {

        if (directionInput == null || directionInput.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty");
        }
        for (char c : directionInput.toCharArray()) { // iterate through the chars in string
            if (c != 'E' && c != 'N' && c != 'S' && c != 'W') {
                throw new IllegalArgumentException("Input must only contain E, N, S, or W");
            }
        }
        return CompassDirection.valueOf(directionInput);
    }



    public static Instruction[] parseInstructions(String instructionsInput) {

        if (instructionsInput == null || instructionsInput.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty");
        }
        for (char c : instructionsInput.toCharArray()) { // iterate through the chars in string
            if (c != 'L' && c != 'R' && c != 'M') {
                throw new IllegalArgumentException("Input must only contain L, R, or M");
            }
            if (!instructionsInput.contains("M")) {
                throw new IllegalArgumentException("Instruction must include a move argument");
            }

        }
        return instructionsInput.chars() // returns each letter "LLR" as a character
                // convert stream of characters into a stream of Instruction enums
                .mapToObj(ch -> Instruction.valueOf(String.valueOf((char) ch))) // array of instruction enums (Instruction.L)
                .toArray(Instruction[]::new); // stores data in array
    }
}



