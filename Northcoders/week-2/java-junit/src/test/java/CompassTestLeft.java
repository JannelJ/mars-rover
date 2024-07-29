import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CompassTestLeft {
    @Test
    void turningLeftFromAllPoints() {
        assertAll("Directions after turning left",
                        () -> assertEquals(Point.WEST, Compass.rotate(Point.NORTH, Direction.LEFT)),
                        () -> assertEquals(Point.NORTH, Compass.rotate(Point.EAST, Direction.LEFT)),
                        () -> assertEquals(Point.EAST, Compass.rotate(Point.SOUTH, Direction.LEFT)),
                        () -> assertEquals(Point.SOUTH, Compass.rotate(Point.WEST, Direction.LEFT))
                );
    }
    }



