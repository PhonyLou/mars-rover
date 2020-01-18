package com.thoughtworks.marsrover.position;

public class Coordinate {
    public int x;
    public int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Coordinate coordinate) {
        return x == coordinate.x && y == coordinate.y;
    }
}
