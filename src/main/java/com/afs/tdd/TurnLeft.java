package com.afs.tdd;

public class TurnLeft implements IExecuteCommand{
    private IMarsRoverCommand iMarsRoverCommand;

    public TurnLeft(IMarsRoverCommand iMarsRoverCommand) {
        this.iMarsRoverCommand = iMarsRoverCommand;
    }

    @Override
    public void execute() {
        this.iMarsRoverCommand.turnLeft();
    }

    @Override
    public void unExecute() {
        this.iMarsRoverCommand.turnRight();
    }
}
