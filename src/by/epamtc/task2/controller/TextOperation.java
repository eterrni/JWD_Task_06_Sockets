package by.epamtc.task2.controller;

import by.epamtc.task2.entity.Text;

public interface TextOperation {

    void printSentencesByWordsCount(Text text);

    void swapSentenceFirstLastWords(Text text);

    void printWordsAlphabetOrder(Text text);
}
