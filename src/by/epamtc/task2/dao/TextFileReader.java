package by.epamtc.task2.dao;

import by.epamtc.task2.dao.exception.DAOException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TextFileReader {

    private static final String ERROR_MESSAGE = "Error reading file";

    public List<String> readSource() throws DAOException {
        List<String> contents = new ArrayList<>();
        Path filePath = FileSystems.getDefault().getPath("resources" + File.separator + "data.txt");

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {

            String line = reader.readLine();
            while (line != null) {
                contents.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new DAOException(ERROR_MESSAGE, e);
        }
        return contents;
    }
}
