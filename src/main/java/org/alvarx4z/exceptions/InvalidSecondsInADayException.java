package org.alvarx4z.exceptions;

public class InvalidSecondsInADayException extends RuntimeException {

    public InvalidSecondsInADayException() {
        super("The number of seconds isn't valid for the range of a day");
    }
}
