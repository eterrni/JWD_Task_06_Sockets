package by.epamtc.task2.service.impl;

import by.epamtc.task2.dao.DAOFactory;
import by.epamtc.task2.dao.TextDAO;
import by.epamtc.task2.dao.exception.DAOException;
import by.epamtc.task2.entity.Text;
import by.epamtc.task2.service.TextService;
import by.epamtc.task2.service.exception.ServiceException;

public class TextServiceImpl implements TextService {

    @Override
    public Text getText() throws ServiceException {
        DAOFactory factory = DAOFactory.getInstance();
        TextDAO dao = factory.getTextDAO();

        Text text = null;
        try {
            text = dao.loadText();
        } catch (DAOException e) {
            throw new ServiceException(e);
        }
        return text;
    }

}
