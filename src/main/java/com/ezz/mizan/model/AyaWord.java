package com.ezz.mizan.model;

import java.util.List;

public class AyaWord {
    private String ayaWord;
    private int wordWeight;
    private List<WordAlphabets> wordAlphabets;

    public String getAyaWord() {
        return ayaWord;
    }

    public void setAyaWord(String ayaWord) {
        this.ayaWord = ayaWord;
    }

    public int getWordWeight() {
        return wordWeight;
    }

    public void setWordWeight(int wordWeight) {
        this.wordWeight = wordWeight;
    }

    public List<WordAlphabets> getWordAlphabets() {
        return wordAlphabets;
    }

    public void setWordAlphabets(List<WordAlphabets> wordAlphabets) {
        this.wordAlphabets = wordAlphabets;
    }

    @Override
    public String toString() {
        return "AyaWord{" +
                "ayaWord='" + ayaWord + '\'' +
                ", wordWeight=" + wordWeight +
                ", wordAlphabets=" + wordAlphabets +
                '}';
    }
}
