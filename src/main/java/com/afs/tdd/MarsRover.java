package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarsRover implements IMarsRoverCommand{

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

    private static final List<Class> validCommands = Collections.unmodifiableList(Arrays.asList(Move.class, TurnLeft.class, TurnRight.class));
    private List<IExecuteCommand> invalidCommands = new ArrayList<>();

    public MarsRover(int locationX, int locationY, String heading) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.heading = heading;
    }

    // TODO: 10/16/2020 Change try and catch to throws CommandNotDefinedException
//    public void executeCommands(String commands) throws CommandNotDefinedException{
//        for (String command : commands.split("")){
//            executeCommand(command);
//        }
//    }

//    private void executeCommands(List<IExecuteCommand> commandList) {
//        commandList.forEach(iExecuteCommand -> {
//            if(!validCommands.contains(iExecuteCommand.getClass())){
//                invalidCommands.add(iExecuteCommand);
//                throw new CommandNotDefinedException();
//            }
//        });
//    }

    public void executeCommands(List<IExecuteCommand> commandList) throws CommandNotDefinedException {
        for (IExecuteCommand command: commandList) {
            if(!validCommands.contains(command.getClass())){
                invalidCommands.add(command);
                throw new CommandNotDefinedException();
            }
            command.execute();
        }
    }

    public void unExecuteCommand(List<IExecuteCommand> commandList) {
        commandList.forEach(IExecuteCommand::unExecute);
    }

    public void executeCommand(String command) throws CommandNotDefinedException {
        if (command.equals(MOVE)) {
            move();
        } else if (command.equals(TURN_LEFT)) {
            turnLeft();
        } else if (command.equals(TURN_RIGHT)) {
            turnRight();
        } else {
            throw new CommandNotDefinedException();
        }
    }

    @Override
    public void move() {
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

    @Override
    public void turnLeft() {
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

    @Override
    public void turnRight() {
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

    @Override
    public void moveBackwards() {
        if (heading.equals(NORTH)) {
            locationY -= 1;
        } else if (heading.equals(SOUTH)) {
            locationY += 1;
        } else if (heading.equals(EAST)) {
            locationX -= 1;
        } else if (heading.equals(WEST)) {
            locationX += 1;
        }
    }

    // TODO: 10/16/2020  ENUM or Object to extract location
    public int getLocationX() {
        return locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    // TODO: 10/16/2020  Used Object to extract direction
    public String getHeading() {
        return heading;
    }
}
