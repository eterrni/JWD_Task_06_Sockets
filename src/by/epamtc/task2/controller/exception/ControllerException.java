package by.epamtc.task2.controller.exception;

import java.io.IOException;

public class ControllerException extends Exception {

    public ControllerException() {
    }

    public ControllerException(String message) {
        super(message);
    }

    public ControllerException(Throwable cause) {
        super(cause);
    }

    public ControllerException(String serverConnectionMessage, IOException e) {
    }

    public ControllerException(String serializedClassMessage, ClassNotFoundException e) {
    }
}
