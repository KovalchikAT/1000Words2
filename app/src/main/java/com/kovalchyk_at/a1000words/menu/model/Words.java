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
    private ArrayList<Integer> sunonimIds; //масив що містить індекси синонімів

    public Words(Integer wordId, String word, String transcription, ArrayList<Integer> translateIds, ArrayList<Integer> sunonimIds) {
        this.wordId = wordId;
        this.word = word;
        this.transcription = transcription;
        this.translateIds = translateIds;
        this.sunonimIds = sunonimIds;
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

    public ArrayList<Integer> getSunonimIds() {
        return sunonimIds;
    }
}
