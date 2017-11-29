package com.kovalchyk_at.a1000words.menu.model;

import java.util.ArrayList;

/**
 * Created by Kovalchyk_at on 08.11.2017.
 */

public class Words {
    private Integer wordId;
    private String word;            //слово
    private String transcription;   //транскрипція
    private ArrayList<Integer> translateIds; //масив що містить індекси перекладів
    private ArrayList<Integer> synonymIds; //масив що містить індекси синонімів
    private String language;

    public Words(Integer wordId, String word, String transcription, ArrayList<Integer> translateIds, ArrayList<Integer> synonymIds, String language) {
        this.wordId = wordId;
        this.word = word;
        this.transcription = transcription;
        this.translateIds = translateIds;
        this.synonymIds = synonymIds;
        this.language = language;
    }

    public int translateArrSize() {
        return translateIds.size();
    }

    public int synonymArrSize() {
        return translateIds.size();
    }

    public String getWord() {
        return word;
    }

    public String getTranscription() {
        return transcription;
    }

    public ArrayList<Integer> getTranslateIds() {
        return translateIds;
    }

    public String getLanguage() {
        return language;
    }

    public Integer getWordId() {
        return wordId;
    }

    public ArrayList<Integer> getSynonymIds() {
        return synonymIds;
    }
}
