package com.afs.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Application {
    private List<IExecuteCommand> iExecuteCommands = new ArrayList<>();

    public Application(IExecuteCommand... iExecuteCommands) {
        this.iExecuteCommands.addAll(Arrays.asList(iExecuteCommands));
    }

    public List<IExecuteCommand> process(){
        return iExecuteCommands;
    }

    public List<IExecuteCommand> reverseProcess(){
        Collections.reverse(iExecuteCommands);
        return iExecuteCommands;
    }

    public void removeCommand(List<IExecuteCommand> invalidCommands){
        iExecuteCommands.removeIf(invalidCommands::contains);
    }
}
