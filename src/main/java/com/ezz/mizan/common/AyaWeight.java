package com.ezz.mizan.common;

import com.ezz.mizan.model.AyaWord;
import com.ezz.mizan.model.FullAya;
import com.ezz.mizan.model.WordAlphabets;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AyaWeight {

    private static Map<String, Integer> arabicAlphabetWeight;

    public static FullAya getAyaWeight(String theAya){
        FullAya fullAya = new FullAya();
        String aya = Normalizer.normalize(theAya, Normalizer.Form.NFKD).replaceAll("\\p{M}", "");
        fullAya.setFullAya(aya);
        String[] arrOfStr = aya.split(" ");
        Integer ayaWeight = 0 ;

        List<AyaWord> ayaWords = new ArrayList<AyaWord>();

        for (String a : arrOfStr) {
            System.out.println(" الكلمه : " + a);
            AyaWord ayaWord = getAyaWordWeight(a);
            ayaWords.add(ayaWord);
            System.out.println("  الكلمه :  " + a + " الوزن :  " + ayaWord.getWordWeight()) ;
            ayaWeight = ayaWeight + ayaWord.getWordWeight() ;
        }
        fullAya.setAyaWords(ayaWords);
        fullAya.setAyaWeight(ayaWeight);
        return fullAya;
    }

    private static AyaWord getAyaWordWeight(String ayaOneWord){
        Integer wordWeight = 0 ;
        AyaWord ayaWord = new AyaWord();
        ayaWord.setAyaWord(ayaOneWord);
        List<WordAlphabets> ayaWordsAlphabets = new ArrayList<WordAlphabets>();

        for (char c: ayaOneWord.toCharArray()) {
            WordAlphabets wordAlphabet = new WordAlphabets();

            Integer alphabetWeight = getAlphabetWeight(String.valueOf(c));
            System.err.println("الحرف : " + c + "  الوزن : " + getAlphabetWeight(String.valueOf(c)));

            wordAlphabet.setAlphabet(String.valueOf(c));
            if (!alphabetWeight.equals(null)){
                System.err.println("the word is not exist ");
                wordAlphabet.setAlphabetWeight(0);
            }else {
                wordAlphabet.setAlphabetWeight(alphabetWeight);
            }
            ayaWordsAlphabets.add(wordAlphabet);
            wordWeight = wordWeight+ alphabetWeight;
        }
        ayaWord.setWordWeight(wordWeight);
        ayaWord.setWordAlphabets(ayaWordsAlphabets);
        return ayaWord;
    }

   // private static WordAlphabets getAyaAlphabetWeight(String ayaWord){}

    public static Integer getAlphabetWeight(String key) {
        return arabicAlphabetWeight.get(key);
    }
    static{
        arabicAlphabetWeight = new HashMap<>();
        arabicAlphabetWeight.put("ي", 10);
        arabicAlphabetWeight.put("و", 6);
        arabicAlphabetWeight.put("ه", 5);
        arabicAlphabetWeight.put("ن", 50);
        arabicAlphabetWeight.put("م", 40);
        arabicAlphabetWeight.put("ل", 30);
        arabicAlphabetWeight.put("ك", 20);
        arabicAlphabetWeight.put("ق", 100);
        arabicAlphabetWeight.put("ف", 80);
        arabicAlphabetWeight.put("غ", 100);
        arabicAlphabetWeight.put("ع", 70);
        arabicAlphabetWeight.put("ظ", 900);
        arabicAlphabetWeight.put("ط", 9);
        arabicAlphabetWeight.put("ض", 800);
        arabicAlphabetWeight.put("ص", 90);
        arabicAlphabetWeight.put("ش", 300);
        arabicAlphabetWeight.put("س", 60);
        arabicAlphabetWeight.put("ز", 7);
        arabicAlphabetWeight.put("ر", 200);
        arabicAlphabetWeight.put("ذ", 700);
        arabicAlphabetWeight.put("د", 4);
        arabicAlphabetWeight.put("خ", 600);
        arabicAlphabetWeight.put("ح", 8);
        arabicAlphabetWeight.put("ج", 3);
        arabicAlphabetWeight.put("ث", 500);
        arabicAlphabetWeight.put("ت", 400);
        arabicAlphabetWeight.put("ب", 2);
        arabicAlphabetWeight.put("ا", 1);
        arabicAlphabetWeight.put("أ", 1);
        arabicAlphabetWeight.put("ة", 5);
        arabicAlphabetWeight.put("ؤ", 6);
        arabicAlphabetWeight.put("إ", 1);
        arabicAlphabetWeight.put("ئ", 1);
        arabicAlphabetWeight.put("ء", 1);
        arabicAlphabetWeight.put("آ", 1);
        arabicAlphabetWeight.put("ى", 10);

    }
}
