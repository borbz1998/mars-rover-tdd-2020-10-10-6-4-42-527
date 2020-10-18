package com.afs.tdd;

public class CommandNotDefinedException extends Throwable {

    public CommandNotDefinedException(){
        super("Invalid Input Command!");
    }

}
