package com.teachmeskills.lesson13.fabric;

import com.teachmeskills.lesson13.conditionException.CheckMistakes;
import com.teachmeskills.lesson13.myOwnException.WrongConfirmPassword;
import com.teachmeskills.lesson13.myOwnException.WrongLoginException;
import com.teachmeskills.lesson13.myOwnException.WrongPasswordException;

import java.util.Scanner;
/*
the method class contains the logic for displaying our program on the screen
 */

public class Method {
    public static void method() {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(" OK! Let's start! Enter your password. Please use English keyboard layout. ");
            String password = scanner.nextLine();

            CheckMistakes.checkMistakesPassword(password);

            System.out.println(" Good! Next step! Enter your login please ");
            String login = scanner.nextLine();

            CheckMistakes.checkMistakesLogin(login);

            System.out.println(" Okay, and can you confirm your password now? ");
            String confirmPassword = scanner.nextLine();

            CheckMistakes.checkMistakesConfirmPassword(password, confirmPassword);

        } catch (WrongPasswordException | WrongLoginException | WrongConfirmPassword e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException exception) {
            System.out.println(" Sorry! Something unexpected happened. Please, try again later or contact our support team. ");
        } finally {
            scanner.close();
        }

        System.out.println(" Thank you! ");

    }
}
