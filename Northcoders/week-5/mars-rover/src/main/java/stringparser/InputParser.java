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
        return CompassDirection.valueOf(directionInput);
    }


    public static Instruction[] parseInstructions(String instructionsInput) {
        return instructionsInput.chars() // returns each letter "LLR" as a character
                // convert stream of characters into a stream of Instruction enums
                .mapToObj(c -> Instruction.valueOf(String.valueOf((char) c))) // array of instruction enums (Instruction.L)
                .toArray(Instruction[]::new); // stores data in array
    }

}
