package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_x_0_y_0_heading_N_return_x_1_y_0_heading_N_given_MLMR() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        //when
        String command = "MLMR";
        marsRover.executeCommands(command);

        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals("N", marsRover.getHeading());
    }
}
