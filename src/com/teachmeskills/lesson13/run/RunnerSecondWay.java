package com.teachmeskills.lesson13.run;

import com.teachmeskills.lesson13.conditionException.CheckMistakesWayTwo;
import com.teachmeskills.lesson13.myOwnException.WrongConfirmPassword;
import com.teachmeskills.lesson13.myOwnException.WrongLoginException;
import com.teachmeskills.lesson13.myOwnException.WrongPasswordException;

import java.util.Scanner;
/*
another method that calls a method to print the program to the screen via an array
 */
public class RunnerSecondWay {

    public static void main(String[] args) throws WrongLoginException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your login ");
        try {
            String login = scanner.nextLine();
            CheckMistakesWayTwo.secondLoginCheck(login);

            String password = scanner.nextLine();
            CheckMistakesWayTwo.secondPasswordCheck(password);

            String confirmPassword = scanner.nextLine();
            CheckMistakesWayTwo.secondConfirmPasswordCheck(password, confirmPassword);

        } catch (WrongLoginException | WrongPasswordException | WrongConfirmPassword e) {
            System.out.println(e.getMessage());
        }

    }
}
