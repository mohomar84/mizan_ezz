package com.ezz.mizan.model;

import java.util.List;

public class FullAya {
    private String fullAya;
    private int ayaWeight;
    private List<AyaWord> ayaWords;

    public String getFullAya() {
        return fullAya;
    }

    public void setFullAya(String fullAya) {
        this.fullAya = fullAya;
    }

    public int getAyaWeight() {
        return ayaWeight;
    }

    public void setAyaWeight(int ayaWeight) {
        this.ayaWeight = ayaWeight;
    }

    public List<AyaWord> getAyaWords() {
        return ayaWords;
    }

    public void setAyaWords(List<AyaWord> ayaWords) {
        this.ayaWords = ayaWords;
    }

    @Override
    public String toString() {
        return "FullAya{" +
                "fullAya='" + fullAya + '\'' +
                ", ayaWeight=" + ayaWeight +
                ", ayaWords=" + ayaWords +
                '}';
    }
}
