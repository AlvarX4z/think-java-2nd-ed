package org.alvarx4z.exceptions;

public class InvalidSecondNumberException extends RuntimeException {

    public InvalidSecondNumberException() {
        super("The inserted second value isn't between 0 and 59");
    }
}
