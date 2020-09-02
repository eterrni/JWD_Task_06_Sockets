package by.epamtc.task2.controller.print;

import by.epamtc.task2.entity.Text;
import by.epamtc.task2.entity.TextComponent;

import java.util.List;

public class PrintText {

    public static void printText(Text text) {
        List<TextComponent> textContents = text.getTextContents();

        for (TextComponent t : textContents) {
            System.out.println(t.getValue());
        }
    }
}
