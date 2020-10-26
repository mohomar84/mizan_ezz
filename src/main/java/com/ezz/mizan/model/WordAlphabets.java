package com.ezz.mizan.model;

public class WordAlphabets {
    private String alphabet;
    private int alphabetWeight;

    public String getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    public int getAlphabetWeight() {
        return alphabetWeight;
    }

    public void setAlphabetWeight(int alphabetWeight) {
        this.alphabetWeight = alphabetWeight;
    }

    @Override
    public String toString() {
        return "WordAlphabets{" +
                "alphabet='" + alphabet + '\'' +
                ", alphabetWeight=" + alphabetWeight +
                '}';
    }
}
