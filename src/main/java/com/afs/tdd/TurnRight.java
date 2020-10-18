package com.afs.tdd;

public class TurnRight implements IExecuteCommand{
    private IMarsRoverCommand iMarsRoverCommand;

    public TurnRight(IMarsRoverCommand iMarsRoverCommand) {
        this.iMarsRoverCommand = iMarsRoverCommand;
    }

    @Override
    public void execute() {
        this.iMarsRoverCommand.turnRight();
    }

    @Override
    public void unExecute() {
        this.iMarsRoverCommand.turnLeft();
    }
}
