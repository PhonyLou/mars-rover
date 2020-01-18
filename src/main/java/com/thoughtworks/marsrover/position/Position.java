package com.thoughtworks.marsrover.position;

import lombok.Data;

@Data
public class Position {
    private Coordinate coordinate;
    private Direction direction;
}
