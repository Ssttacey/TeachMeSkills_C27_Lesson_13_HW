package com.teachmeskills.lesson13.myOwnException;
/*
manually thrown exception
 */
public class WrongConfirmPassword extends Exception {
    public WrongConfirmPassword() {
    }

    public WrongConfirmPassword(String message) {
        super(message);
    }
}
