package com.teachmeskills.lesson13.conditionException;

import com.teachmeskills.lesson13.myOwnException.WrongConfirmPassword;
import com.teachmeskills.lesson13.myOwnException.WrongLoginException;
import com.teachmeskills.lesson13.myOwnException.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
the class contains methods for detecting exceptions
 */
public class CheckMistakes {
    public static boolean checkMistakesPassword(String password) throws WrongPasswordException {
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(password);
        if (password.length() > 20) {
            throw new WrongPasswordException(" Sorry, your password is too long. It's must be less then 20 symbols ");
        } else if (password.matches("[a-zA-Z]+")) {
            throw new WrongPasswordException(" Use at least one number in your password ");
        } else if (matcher.find()) {
            throw new WrongPasswordException(" Sorry, but no spaces in your password! ");
        }
        return true;
    }

    public static boolean checkMistakesLogin(String login) throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException(" Sorry, your login is too long. It's must be less then 20 symbols ");
        } else if (login.contains(" ")) {
            throw new WrongLoginException(" Sorry, but no spaces in your login! ");
        }
        return true;
    }

    public static void checkMistakesConfirmPassword(String password, String confirmPassword) throws WrongConfirmPassword {
        if (password.equals(confirmPassword)) {
            System.out.println(" Success! ");
        } else {
            System.out.println(" Please try again. You must be mistaken. ");
        }
    }
}
