package com.thoughtworks.marsrover;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MarsRoverTest {

    @Test
    public void return_0_0_give_0_0() {
        // given
        MarsRover marsRover = new MarsRover();

        // When
        marsRover.coordinate = new Coordinate(0, 0);

        // Then
        assertEquals(0, marsRover.coordinate.x);
        assertEquals(0, marsRover.coordinate.y);
    }

    @Test
    public void return_East_give_East() {
        // given
        MarsRover marsRover = new MarsRover();

        // When
        marsRover.direction = Direction.E;

        // Then
        assertEquals(Direction.E, marsRover.direction);
    }

    @Test
    public void return_1_0_give_0_0() {
        MarsRover marsRover = new MarsRover();
        marsRover.direction = Direction.E;
        marsRover.coordinate = new Coordinate(0, 0);
        Coordinate expect = new Coordinate(1, 0);

        Coordinate actual = marsRover.forward();

        // Then
        assertTrue(actual.equals(expect));
    }

    @Test
    public void return_N_give_East_Turn_Left() {
        MarsRover marsRover = new MarsRover();
        marsRover.direction = Direction.E;

        Direction direction = marsRover.turn(TurnCommand.L);

        assertEquals(Direction.N, direction);
    }

    @Test
    public void return_S_give_East_Turn_Right() {
        MarsRover marsRover = new MarsRover();
        marsRover.direction = Direction.E;

        Direction direction = marsRover.turn(TurnCommand.R);

        assertEquals(Direction.S, direction);
    }
}
