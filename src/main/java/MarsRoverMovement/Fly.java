package MarsRoverMovement;

import Interface.IExecuteCommand;
import Interface.IMarsRoverCommand;

public class Fly implements IExecuteCommand {
    private IMarsRoverCommand iMarsRoverCommand;

    public Fly(IMarsRoverCommand iMarsRoverCommand) {
        this.iMarsRoverCommand = iMarsRoverCommand;
    }

    @Override
    public void execute() {
        this.iMarsRoverCommand.move();
    }

    @Override
    public void unExecute() {
        this.iMarsRoverCommand.move();
    }
}
