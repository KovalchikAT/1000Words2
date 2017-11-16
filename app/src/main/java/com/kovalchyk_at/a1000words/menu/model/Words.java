package com.kovalchyk_at.a1000words.menu.model;

import java.util.ArrayList;

/**
 * Created by Kovalchyk_at on 08.11.2017.
 */

public class Words {
    private Integer wordId;
    private String word;            //слово
    private String transcription;   //транскрипція
    private String param;          //мова слова
    private ArrayList<Integer> relatedIds; //масив що містить індекси повязаних слів(синоніми, переклади... )

    public Words(Integer wordId, String word, String transcription, String param, ArrayList<Integer> relatedIds) {
        this.wordId = wordId;
        this.word = word;
        this.transcription = "[" + transcription + "]";
        this.param = param;
        this.relatedIds = relatedIds;
    }

    public void SetTranslate(Words words) {
        relatedIds.add(words.wordId);
    }
}
