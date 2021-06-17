package com.ezz.mizan.model;

import javax.persistence.*;

@Entity
@Table(name = "quran_text")
public class QuranText {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private static int index;
    private static int sura;
    private static int aya;
    private static String text;

    public QuranText() {
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        QuranText.index = index;
    }

    public static int getSura() {
        return sura;
    }

    public static void setSura(int sura) {
        QuranText.sura = sura;
    }

    public static int getAya() {
        return aya;
    }

    public static void setAya(int aya) {
        QuranText.aya = aya;
    }

    public static String getText() {
        return text;
    }

    public static void setText(String text) {
        QuranText.text = text;
    }
}
