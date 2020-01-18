package com.thoughtworks.marsrover;

/**

 Y       N
         |
         |
 X  W---------E
         |
 *       |
 *       S
 */
public class MarsRover {
    Coordinate coordinate;
    Direction direction;
    private int speed = 1;

    Coordinate forward() {
        switch (direction) {
            case E:
                coordinate.x += speed; break;
            case W:
                coordinate.x -= speed; break;
            case S:
                coordinate.y -= speed; break;
            case N:
                coordinate.y += speed; break;
        }
        return coordinate;
    }

    Direction turn(final TurnCommand command) {
        if (TurnCommand.L == command) {
            switch (direction) {
                case E:
                    this.direction = Direction.N; break;
                case W:
                    this.direction = Direction.S; break;
                case S:
                    this.direction = Direction.E; break;
                case N:
                    this.direction = Direction.W; break;
            }
        } else {
            switch (direction) {
                case E:
                    this.direction = Direction.S; break;
                case W:
                    this.direction = Direction.N; break;
                case S:
                    this.direction = Direction.W; break;
                case N:
                    this.direction = Direction.E; break;
            }
        }

        return direction;
    }
}
