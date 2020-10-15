package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private final int locationX;
    private final int locationY;
    private final String heading;

    public MarsRover(int locationX, int locationY, String heading) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.heading = heading;
    }

    public void executeCommands(String commands){
        Arrays.asList(commands.split("")).
                forEach(command -> this.executeCommand(command));
    }

    private void executeCommand(String command) {
    }

    public int getLocationX() {
        return 0;
    }

    public int getLocationY() {
        return 0;
    }

    public String getHeading() {
        return "N";
    }
}
