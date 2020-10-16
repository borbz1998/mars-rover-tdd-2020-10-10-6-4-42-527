package com.afs.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DemoTest {

    private static final String NORTH = "N";
    private static final String WEST = "W";
    private static final String EAST = "E";
    private static final String SOUTH = "S";
    private static final String TURN_LEFT = "L";
    private static final String TURN_RIGHT = "R";
    private static final String MOVE = "M";
    private String command;

    @Test
    void should_x_0_y_1_heading_N_when_execute_given_x_0_y_0_heading_N_command_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        //when
        command = MOVE;
        marsRover.executeCommands(command);

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals(NORTH, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_W_when_execute_given_x_0_y_0_heading_N_command_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        //when
        command = TURN_LEFT;
        marsRover.executeCommands(command);

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(WEST, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_E_when_execute_given_x_0_y_0_heading_N_command_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        //when
        command = TURN_RIGHT;
        marsRover.executeCommands(command);

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(EAST, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_1_heading_S_when_execute_given_x_0_y_0_heading_S_command_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, SOUTH);

        //when
        command = MOVE;
        marsRover.executeCommands(command);

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(-1, marsRover.getLocationY());
        assertEquals(SOUTH, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_E_when_execute_given_x_0_y_0_heading_S_command_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, SOUTH);

        //when
        command = TURN_LEFT;
        marsRover.executeCommands(command);

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(EAST, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_W_when_execute_given_x_0_y_0_heading_S_command_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, SOUTH);

        //when
        command = TURN_RIGHT;
        marsRover.executeCommands(command);

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(WEST, marsRover.getHeading());
    }

    @Test
    void should_x_1_y_0_heading_E_when_execute_given_x_0_y_0_heading_E_command_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, EAST);

        //when
        command = MOVE;
        marsRover.executeCommands(command);

        //then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(EAST, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_N_when_execute_given_x_0_y_0_heading_E_command_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, EAST);

        //when
        command = TURN_LEFT;
        marsRover.executeCommands(command);

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(NORTH, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_S_when_execute_given_x_0_y_0_heading_E_command_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, EAST);

        //when
        command = TURN_RIGHT;
        marsRover.executeCommands(command);

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(SOUTH, marsRover.getHeading());
    }

    @Test
    void should_x_1_y_0_heading_W_when_execute_given_x_0_y_0_heading_W_command_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, WEST);

        //when
        command = MOVE;
        marsRover.executeCommands(command);

        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(WEST, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_S_when_execute_given_x_0_y_0_heading_W_command_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, WEST);

        //when
        command = TURN_LEFT;
        marsRover.executeCommands(command);

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(SOUTH, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_N_when_execute_given_x_0_y_0_heading_W_command_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, WEST);

        //when
        command = TURN_RIGHT;
        marsRover.executeCommands(command);

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(NORTH, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_N_return_x_1_y_0_heading_N_given_MLMR() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        //when
        command = "MLMR";
        marsRover.executeCommands(command);

        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals(NORTH, marsRover.getHeading());
    }

    @Test
    void should_throw_command_not_defined_exception_heading_N_when_execute_given_x_0_y_0_heading_N_command_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        //when
        command = "F";
        marsRover.executeCommands(command);

        //then
        assertThrows(CommandNotDefinedException.class, () -> marsRover.executeCommand(command));
    }
}
