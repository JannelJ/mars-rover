package org.example;

public class Rover {

    private Position position;
    private Plateau plateau;

    public Rover(Position position, Plateau plateau) {
        this.position = position;
        this.plateau = plateau;
    }

    public void rotate(char Instruction) {
        if (Instruction == 'L') {
            turnLeft();
        } else if (Instruction == 'R') {
            turnRight();
        } else if (Instruction == 'M') {
            moveForward();
        }

    }

    private void turnLeft(){
        CompassDirection newDirection = position.getDirection().turnLeft(); // co-ordinates, then rotate in specified direction
        position = new Position(position.getX(), position.getY(), newDirection);
    }

    private void turnRight(){
        CompassDirection newDirection = position.getDirection().turnRight(); // "2, 3 N" -> "2, 3, E"
        position = new Position(position.getX(), position.getY(), newDirection); // new position object to store updated position without changing original object

    }
    private void moveForward(){
        Position newPosition = this.position.calculateNewPosition();
        if (plateau.isPositionValid(newPosition)) {
            position = newPosition;
        } else {
            System.out.println("Move is out of bounds!");
        }
    }

    public Position getPosition() {
        return this.position;
    }
}
