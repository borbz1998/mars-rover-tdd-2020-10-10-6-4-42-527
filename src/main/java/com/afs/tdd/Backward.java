package com.afs.tdd;

public class Backward implements IExecuteCommand {
    private IMarsRoverCommand iMarsRoverCommand;

    public Backward(IMarsRoverCommand iMarsRoverCommand) {
        this.iMarsRoverCommand = iMarsRoverCommand;
    }

    @Override
    public void execute() {
        this.iMarsRoverCommand.moveBackwards();
    }

    @Override
    public void unExecute() {
        this.iMarsRoverCommand.move();
    }
}
