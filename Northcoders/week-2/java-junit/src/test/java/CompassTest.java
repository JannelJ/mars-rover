import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassTest {

    @Test
    @DisplayName("east facing test")
    void checkIfPointIsFacingEast() {

        Point point = Point.NORTH;
        Direction direction = Direction.RIGHT;

        assertEquals(Point.EAST, Compass.rotate(Point.NORTH, Direction.RIGHT)); // mistake of compass.point

    }

    @Test
    void turningRightFromAllPoints() {
        assertAll("Checking all directions turning right",
                () -> assertEquals(Point.EAST, Compass.rotate(Point.NORTH, Direction.RIGHT)),
                () -> assertEquals(Point.SOUTH, Compass.rotate(Point.EAST, Direction.RIGHT)),
                () -> assertEquals(Point.WEST, Compass.rotate(Point.SOUTH, Direction.RIGHT)),
                () -> assertEquals(Point.NORTH, Compass.rotate(Point.WEST, Direction.RIGHT))
        );
    }
}
