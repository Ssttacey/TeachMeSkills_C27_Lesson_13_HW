package com.teachmeskills.lesson13.myOwnException;
/*
manually thrown exception
 */

public class WrongLoginException extends Exception {
    public WrongLoginException(){
    }

    public WrongLoginException(String message){
        super(message);
    }
}
