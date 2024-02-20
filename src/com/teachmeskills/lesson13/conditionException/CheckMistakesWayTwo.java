package com.teachmeskills.lesson13.conditionException;

import com.teachmeskills.lesson13.myOwnException.WrongConfirmPassword;
import com.teachmeskills.lesson13.myOwnException.WrongLoginException;
import com.teachmeskills.lesson13.myOwnException.WrongPasswordException;
/*
the class contains several arrays for detecting exceptions
 */

public class CheckMistakesWayTwo {
    public static boolean secondLoginCheck(String login) throws WrongLoginException {
        char[] log = login.toCharArray();
        boolean loginC = true;
        for (char loginCheck : log) {
            if (loginCheck == ' ' || login.length() > 20) {
                loginC = false;
                break;

            }
        }
        if (!loginC) {
            throw new WrongLoginException(" The login should not contain spaces and no more than 20 symbols ");
        } else {
            System.out.println(" good login! Success! Enter your password ");
            return true;
        }
    }

    public static boolean secondPasswordCheck(String password) throws WrongPasswordException {
        char[] pas = password.toCharArray();
        Boolean passwordC = true;
        for (char passwordCheck : pas) {
            if (passwordCheck == ' ' || password.length() > 20 || password.matches("[a-zA-Z]+")) {
                passwordC = false;
                break;
            }
        }
        if (!passwordC) {
            throw new WrongPasswordException(" The password should not contain spaces and no more than 20 symbols. the password must contain at least one number");
        } else {
            System.out.println(" password saved successfully! Please repeat your password ");
            return true;
        }
    }


    public static boolean secondConfirmPasswordCheck(String password, String confirmPassword) throws WrongConfirmPassword {
        char[] conf = confirmPassword.toCharArray();
        Boolean confirmC = true;

        for (char confirmCheck : conf) {

            if (!confirmPassword.equals(password)) {
                throw new WrongConfirmPassword(" Password mismatch ");
            } else {
            }
        }
        System.out.println(" registration completed! ");
        return true;
    }

}
