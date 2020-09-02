package by.epamtc.task2.dao;

import by.epamtc.task2.dao.exception.DAOException;
import by.epamtc.task2.entity.Text;

public interface TextDAO {

    Text loadText() throws DAOException;
}
