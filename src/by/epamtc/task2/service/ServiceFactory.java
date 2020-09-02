package by.epamtc.task2.service;

import by.epamtc.task2.service.impl.TextServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final TextService textService = new TextServiceImpl();

    public static ServiceFactory getInstance() {
        return instance;
    }

    public ServiceFactory() {

    }

    public TextService getTextService() {
        return textService;
    }
}
