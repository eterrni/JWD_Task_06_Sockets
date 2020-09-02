package by.epamtc.task2.server;


import by.epamtc.task2.server.exception.ServerException;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

    private static final String ERROR_MESSAGE = "Server exception";

    public static void main(String[] args) throws ServerException {

        startServer();
    }

    private static void startServer() throws ServerException {
        try (ServerSocket serverSocket = new ServerSocket(8000)) {
            while (true) {
                new TextResponse(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            throw new ServerException(ERROR_MESSAGE, e);
        }
    }
}
