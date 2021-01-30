package com.smatrfoxpro.test.service.impl;

import com.smatrfoxpro.test.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private List<String> words;

    private String lastWord;

    private boolean enable;

    @Override
    public String begin() {
        enable = true;
        lastWord = words.get((int) (Math.random() * words.size()));
        return "Игра началась! \nСлово: " + lastWord;
    }

    @Override
    public String getNextWord(String word) {
        if (enable) {
            if (checkLastLetter(word)) {
                lastWord = words.stream()
                        .filter(w -> w.toLowerCase().startsWith(checkLastLetterPlayer(word)))
                        .findAny()
                        .orElse("Города на такую букву не найдено.");
                return lastWord;
            } else {
                return getLastLetterMessage();
            }
        }
        return "Игра выключена.";
    }

    @Override
    public String end() {
        enable = false;
        return "Спасибо за игру!";
    }

    private Boolean checkLastLetter(String word) {
        return lastWord.substring(lastWord.length() - 1).equals("ь")
                ? word.toLowerCase().startsWith(lastWord.substring(lastWord.length() - 2, lastWord.length() - 1))
                : word.toLowerCase().startsWith(lastWord.substring(lastWord.length() - 1));
    }

    private String checkLastLetterPlayer(String word) {
        return word.toLowerCase().substring(word.length() - 1).equals("ь")
                ? word.substring(word.length() - 2, word.length() - 1)
                : word.substring(word.length() - 1);
    }

    private String getLastLetterMessage() {
        return lastWord.substring(lastWord.length() - 1).equals("ь")
                ? "Начало слова должно начинаться на букву '" + lastWord.substring(lastWord.length() - 2, lastWord.length() - 1) + "'"
                : "Начало слова должно начинаться на букву '" + lastWord.substring(lastWord.length() - 1) + "'";
    }

}
