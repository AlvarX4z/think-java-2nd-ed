package org.alvarx4z.exceptions;

public class InvalidHourNumberException extends RuntimeException {

    public InvalidHourNumberException() {
        super("The inserted hour value isn't between 0 and 23");
    }
}
