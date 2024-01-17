package org.alvarx4z.exceptions;

public class InvalidMinuteNumberException extends RuntimeException {

    public InvalidMinuteNumberException() {
        super("The inserted minute value isn't between 0 and 59");
    }
}
