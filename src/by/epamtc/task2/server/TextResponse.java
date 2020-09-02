package by.epamtc.task2.server;

import by.epamtc.task2.entity.Text;
import by.epamtc.task2.service.ServiceFactory;
import by.epamtc.task2.service.TextService;
import by.epamtc.task2.service.exception.ServiceException;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class TextResponse extends Thread {

    private final Socket socket;

    public TextResponse(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(this.socket.getOutputStream())) {

            ServiceFactory factory = ServiceFactory.getInstance();
            TextService textService = factory.getTextService();

            Text text = new Text();
            try {
                text = textService.getText();
            } catch (ServiceException e) {
                e.printStackTrace();
            }
            objectOutputStream.writeObject(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
