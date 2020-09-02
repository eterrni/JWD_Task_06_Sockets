package by.epamtc.task2.dao;

import by.epamtc.task2.dao.impl.TextDAOImpl;

public class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();

    private final TextDAO textDAO = new TextDAOImpl();

    public TextDAO getTextDAO() {
        return textDAO;
    }

    public static DAOFactory getInstance() {
        return instance;
    }
}
