package by.epamtc.task2.dao.impl;

import by.epamtc.task2.dao.FileParser;
import by.epamtc.task2.dao.TextDAO;
import by.epamtc.task2.dao.TextFileReader;
import by.epamtc.task2.dao.exception.DAOException;
import by.epamtc.task2.entity.Text;

import java.util.List;

public class TextDAOImpl implements TextDAO {

    @Override
    public Text loadText() throws DAOException{
        TextFileReader reader = new TextFileReader();
        List<String> fileContents = reader.readSource();

        return FileParser.buildText(fileContents);
    }
}
