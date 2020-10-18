package com.afs.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DemoTest {

    private static final String NORTH = "N";
    private static final String WEST = "W";
    private static final String EAST = "E";
    private static final String SOUTH = "S";

    // TODO: 10/16/2020 Change to ENUM

    @Test
    void should_x_0_y_1_heading_N_when_execute_given_x_0_y_0_heading_N_command_M() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        //when
        Application application = new Application(new Move(marsRover));
        marsRover.executeCommands(application.process());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals(NORTH, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_W_when_execute_given_x_0_y_0_heading_N_command_L() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        //when
        Application application = new Application(new TurnLeft(marsRover));
        marsRover.executeCommands(application.process());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(WEST, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_E_when_execute_given_x_0_y_0_heading_N_command_R() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        //when
        Application application = new Application(new TurnRight(marsRover));
        marsRover.executeCommands(application.process());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(EAST, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_1_heading_S_when_execute_given_x_0_y_0_heading_S_command_M() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, SOUTH);

        //when
        Application application = new Application(new Move(marsRover));
        marsRover.executeCommands(application.process());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(-1, marsRover.getLocationY());
        assertEquals(SOUTH, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_E_when_execute_given_x_0_y_0_heading_S_command_L() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, SOUTH);

        //when
        Application application = new Application(new TurnLeft(marsRover));
        marsRover.executeCommands(application.process());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(EAST, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_W_when_execute_given_x_0_y_0_heading_S_command_R() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, SOUTH);

        //when
        Application application = new Application(new TurnRight(marsRover));
        marsRover.executeCommands(application.process());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(WEST, marsRover.getHeading());
    }

    @Test
    void should_x_1_y_0_heading_E_when_execute_given_x_0_y_0_heading_E_command_M() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, EAST);

        //when
        Application application = new Application(new Move(marsRover));
        marsRover.executeCommands(application.process());

        //then
        assertEquals(1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(EAST, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_N_when_execute_given_x_0_y_0_heading_E_command_L() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, EAST);

        //when
        Application application = new Application(new TurnLeft(marsRover));
        marsRover.executeCommands(application.process());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(NORTH, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_S_when_execute_given_x_0_y_0_heading_E_command_R() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, EAST);

        //when
        Application application = new Application(new TurnRight(marsRover));
        marsRover.executeCommands(application.process());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(SOUTH, marsRover.getHeading());
    }

    @Test
    void should_x_1_y_0_heading_W_when_execute_given_x_0_y_0_heading_W_command_M() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, WEST);

        //when
        Application application = new Application(new Move(marsRover));
        marsRover.executeCommands(application.process());

        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(WEST, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_S_when_execute_given_x_0_y_0_heading_W_command_L() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, WEST);

        //when
        Application application = new Application(new TurnLeft(marsRover));
        marsRover.executeCommands(application.process());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(SOUTH, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_N_when_execute_given_x_0_y_0_heading_W_command_R() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, WEST);

        //when
        Application application = new Application(new TurnRight(marsRover));
        marsRover.executeCommands(application.process());

        //then
        assertEquals(0, marsRover.getLocationX());
        assertEquals(0, marsRover.getLocationY());
        assertEquals(NORTH, marsRover.getHeading());
    }

    @Test
    void should_x_0_y_0_heading_N_return_x_1_y_0_heading_N_given_MLMR() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        //when
        Application application = new Application(new Move(marsRover), new TurnLeft(marsRover), new Move(marsRover), new TurnRight(marsRover));
        marsRover.executeCommands(application.process());

        //then
        assertEquals(-1, marsRover.getLocationX());
        assertEquals(1, marsRover.getLocationY());
        assertEquals(NORTH, marsRover.getHeading());
    }

    @Test
    void should_throw_CommandNotDefinedException_heading_N_when_execute_given_x_0_y_0_heading_N_command_R() throws CommandNotDefinedException {
        //given
        MarsRover marsRover = new MarsRover(0, 0, NORTH);

        //when
        Application application = new Application(new Fly(marsRover));

        //then
        assertThrows(CommandNotDefinedException.class, () -> marsRover.executeCommands(application.process()));
    }
}
