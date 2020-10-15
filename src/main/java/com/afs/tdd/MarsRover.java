package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private int locationX;
    private int locationY;
    private String heading;

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
        if(command.equals("M")){
            move();
        }
        else if(command.equals("L")){
            turnLeft();
        }
        else if(command.equals("R")){
            turnRight();
        }
    }

    private void turnRight() {
        if (heading == "N"){
            heading = "E";
        }
        else if (heading == "S"){
            heading = "W";
        }
        else if (heading == "E"){
            heading = "S";
        }
    }

    private void turnLeft() {
        if (heading == "N"){
            heading = "W";
        }
        else if (heading == "S"){
            heading = "E";
        }
        else if (heading == "E"){
            heading = "N";
        }
    }

    public void move() {
        if (heading == "N"){
            locationY += 1;
        }
        else if (heading == "S"){
            locationY -= 1;
        }
        else if (heading == "E"){
            locationX += 1;
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
