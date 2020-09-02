package by.epamtc.task2.service;

import by.epamtc.task2.entity.Text;
import by.epamtc.task2.service.exception.ServiceException;

public interface TextService {

    Text getText() throws ServiceException;

}
