package com.ua.groupIntro.exceptions;

/**
 * Created by User on 4/28/2017.
 */
public class NoStudentsFoundException extends Exception {
    public NoStudentsFoundException(String message) {
        super("NoStudentsFoundException");
    }
}
