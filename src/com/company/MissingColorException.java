package com.company;

public class MissingColorException extends RuntimeException{
    public MissingColorException(String msg)
    {
        super(msg);
        System.out.println("fancy stuff can be written here...");
    }
}
