package by.epamtc.task2.service.exception;

import by.epamtc.task2.dao.exception.DAOException;

public class ServiceException extends Exception {
    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(DAOException e) {
    }
}
