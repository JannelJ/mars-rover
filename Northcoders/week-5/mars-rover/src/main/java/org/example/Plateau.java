package org.example;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
    private int maxX;
    private int maxY;
    private List<Rover> rovers;

    public Plateau(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.rovers = new ArrayList<>();
    }

    public boolean isPositionValid(Position position) {
        return position.getX() >= 0 && position.getX() <= maxX &&
                position.getY() >= 0 && position.getY() <= maxY;
    }

    public void addRover(Rover rover) {
        if (isPositionValid(rover.getPosition())) {
            rovers.add(rover);
            System.out.println("Rover added to plateau at position: " + rover.getPosition());
        } else {
            System.out.println("Rover position is out of bounds");
        }
    }

    public List<Rover> getRovers() {
        return rovers;
    }
}
