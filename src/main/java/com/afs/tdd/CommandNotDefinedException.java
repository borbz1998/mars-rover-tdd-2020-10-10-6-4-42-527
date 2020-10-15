package com.afs.tdd;

public class CommandNotDefinedException extends Throwable {

    public CommandNotDefinedException(String command){
        super("Invalid Input Command!");
    }
}
