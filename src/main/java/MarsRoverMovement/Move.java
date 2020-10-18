package MarsRoverMovement;

import Interface.IExecuteCommand;
import Interface.IMarsRoverCommand;

public class Move implements IExecuteCommand {
    private IMarsRoverCommand iMarsRoverCommand;

    public Move(IMarsRoverCommand iMarsRoverCommand) {
        this.iMarsRoverCommand = iMarsRoverCommand;
    }

    @Override
    public void execute() {
        this.iMarsRoverCommand.move();
    }

    @Override
    public void unExecute() {
        this.iMarsRoverCommand.moveBackwards();
    }
}
