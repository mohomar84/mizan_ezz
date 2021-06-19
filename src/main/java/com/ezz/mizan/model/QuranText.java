package com.ezz.mizan.model;

//@Entity
//@Table(name = "quran_text")
public class QuranText {
    // @Id
    // @Column(name = "index")
    private static int index;
    //  @Column(name = "sura")
    private static int sura;
    // @Column(name = "aya")
    private static int aya;
    //  @Column(name = "text")
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
