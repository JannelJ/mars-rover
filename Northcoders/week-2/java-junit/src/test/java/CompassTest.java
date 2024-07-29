import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassTest {

    @Test
    @DisplayName ("east facing test")
    void checkIfPointIsFacingEast() {

        Point point = Point.EAST;
        Direction direction = Direction.RIGHT;

        assertEquals(Point.EAST, Compass.rotate(Compass.point, Compass.direction));


    }
}

