package org.example.Exceptions;

import java.io.IOException;

public class WrongNameException extends IOException {

    public WrongNameException(String message) {
        super(message);
    }
}