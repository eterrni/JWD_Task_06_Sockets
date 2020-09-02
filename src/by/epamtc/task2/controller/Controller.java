package by.epamtc.task2.controller;

import by.epamtc.task2.controller.exception.ControllerException;
import by.epamtc.task2.controller.print.PrintText;
import by.epamtc.task2.entity.Text;

public class Controller {

    public static void main(String[] args) throws ControllerException {
        Client clientConnect = new Client();
        Text text = clientConnect.getTextResponse();
//////////////////////////////////////////////////////////////////
        OperationFactory factory = OperationFactory.getInstance();
        TextOperation operation = factory.getTextOperation();
//////////////////////////////////////////////////////////////////
        PrintText.printText(text);
        System.out.println();
//////////////////////////////////////////////////////////////////
        operation.printSentencesByWordsCount(text);
        System.out.println();
//////////////////////////////////////////////////////////////////
        operation.printWordsAlphabetOrder(text);
        System.out.println();
//////////////////////////////////////////////////////////////////
        operation.swapSentenceFirstLastWords(text);
        PrintText.printText(text);
    }
}
