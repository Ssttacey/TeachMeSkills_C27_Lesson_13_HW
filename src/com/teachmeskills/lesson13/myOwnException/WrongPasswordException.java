package com.teachmeskills.lesson13.myOwnException;
/*
manually thrown exception
 */
public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
            super(message);
        }
}
