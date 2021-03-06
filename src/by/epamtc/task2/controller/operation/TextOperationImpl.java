package by.epamtc.task2.controller.operation;

import by.epamtc.task2.controller.TextOperation;
import by.epamtc.task2.entity.Sentence;
import by.epamtc.task2.entity.Text;
import by.epamtc.task2.entity.TextComponent;
import by.epamtc.task2.entity.Word;

import java.util.*;

public class TextOperationImpl implements TextOperation {

    @Override
    public void printSentencesByWordsCount( Text text) {
        List<Sentence> sentences = getSentences(text);
        sentences.sort(Comparator.comparingInt(o -> getWords(o).size()));
        for (Sentence sentence : sentences) {
            System.out.println(sentence.getValue());
        }
    }

    @Override
    public void swapSentenceFirstLastWords(Text text) {
        List<Sentence> sentences = getSentences(text);
        for (Sentence s : sentences) {
            List<TextComponent> sentenceContents = s.getSentenceContents();
            List<Word> words = getWords(s);
            Word first = words.get(0);
            Word last = words.get(words.size() - 1);
            TextComponent current;
            for (int i = 0; i < sentenceContents.size(); i++) {
                current = sentenceContents.get(i);
                if (current == first) {
                    sentenceContents.set(i, last);
                    continue;
                }
                if (current == last) {
                    sentenceContents.set(i, first);
                }
            }
        }
    }

    @Override
    public void printWordsAlphabetOrder(Text text) {
        Set<String> wordsValues = new TreeSet<>();
        List<Sentence> sentences = getSentences(text);
        for (Sentence sentence : sentences) {
            List<Word> words = getWords(sentence);
            for (Word w : words) {
                wordsValues.add(w.getValue().toLowerCase());
            }
        }
        String previousLetter = null;
        String startsWithLetter;
        for (String s : wordsValues) {
            startsWithLetter = s.substring(0, 1);
            if (previousLetter == null) {
                previousLetter = startsWithLetter;
            }
            if (!startsWithLetter.equals(previousLetter)) {
                System.out.println();
                previousLetter = startsWithLetter;
            }
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private List<Sentence> getSentences(Text text) {
        List<Sentence> sentences = new ArrayList<>();
        List<TextComponent> textComponents = text.getTextContents();
        for (TextComponent component : textComponents) {
            if (component.getClass().equals(Sentence.class)) {
                Sentence sentence = (Sentence) component;
                sentences.add(sentence);
            }
        }
        return sentences;
    }

    private List<Word> getWords(Sentence sentence) {
        List<Word> words = new ArrayList<>();
        List<TextComponent> sentenceContents = sentence.getSentenceContents();
        for (TextComponent component : sentenceContents) {
            if (component.getClass().equals(Word.class)) {
                Word word = (Word) component;
                words.add(word);
            }
        }
        return words;
    }
}
