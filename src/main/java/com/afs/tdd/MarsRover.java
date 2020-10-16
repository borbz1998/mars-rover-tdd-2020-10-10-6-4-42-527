package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {

    private static final String MOVE = "M";
    private static final String TURN_LEFT = "L";
    private static final String TURN_RIGHT = "R";
    private static final String NORTH = "N";
    private static final String SOUTH = "S";
    private static final String EAST = "E";
    private static final String WEST = "W";
    private int locationX;
    private int locationY;
    private String heading;

    public MarsRover(int locationX, int locationY, String heading) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.heading = heading;
    }

    public void executeCommands(String commands) {
        Arrays.asList(commands.split("")).
                forEach(command -> {
                    try {
                        this.executeCommand(command);
                    } catch (CommandNotDefinedException e) {
                        e.printStackTrace();
                    }
                });
    }

    public void executeCommand(String command) throws CommandNotDefinedException {
        if (command.equals(MOVE)) {
            move();
        } else if (command.equals(TURN_LEFT)) {
            turnLeft();
        } else if (command.equals(TURN_RIGHT)) {
            turnRight();
        } else {
            throw new CommandNotDefinedException(command);
        }
    }

    private void turnRight() {
        if (heading.equals(NORTH)) {
            heading = EAST;
        } else if (heading.equals(SOUTH)) {
            heading = WEST;
        } else if (heading.equals(EAST)) {
            heading = SOUTH;
        } else if (heading.equals(WEST)) {
            heading = NORTH;
        }
    }

    private void turnLeft() {
        if (heading.equals(NORTH)) {
            heading = WEST;
        } else if (heading.equals(SOUTH)) {
            heading = EAST;
        } else if (heading.equals(EAST)) {
            heading = NORTH;
        } else if (heading.equals(WEST)) {
            heading = SOUTH;
        }
    }

    private void move() {
        if (heading.equals(NORTH)) {
            locationY += 1;
        } else if (heading.equals(SOUTH)) {
            locationY -= 1;
        } else if (heading.equals(EAST)) {
            locationX += 1;
        } else if (heading.equals(WEST)) {
            locationX -= 1;
        }
    }

    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public String getHeading() {
        return heading;
    }
}
