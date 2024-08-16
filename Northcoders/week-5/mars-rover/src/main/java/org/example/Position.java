package org.example;

public class Position {

    private int x;
    private int y;
    private CompassDirection direction;

    public Position(int x, int y, CompassDirection direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public CompassDirection getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + direction + ")";
    }

    public Position calculateNewPosition() { // for moving forwards

        int newX = this.x; // (x, the current position)
        int newY = this.y; // (y, the current position)

        if (this.direction == CompassDirection.N) { // check current direction
            newY++;  // north increases y
        } else if (this.direction == CompassDirection.S) {
            newY--;  // south decreases y
        } else if (this.direction == CompassDirection.E) {
            newX++;  // east increases x
        } else if (this.direction == CompassDirection.W) {
            newX--;  //  west decreases x
        }
        return new Position(newX, newY, this.direction); // updated co-ordinates after moving
    }
}
