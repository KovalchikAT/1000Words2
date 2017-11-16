package com.kovalchyk_at.a1000words.menu.model;

import com.kovalchyk_at.a1000words.MenuActivity;

import java.util.HashMap;

/**
 * Created by Kovalchyk_at on 08.11.2017.
 */

public class MenuModelImpl implements MenuModel {
    private MenuActivity menuActivity;
    private HashMap<Integer, Words> vokabulary;

    public MenuModelImpl(MenuActivity menuActivity) {
        this.menuActivity = menuActivity;
        this.vokabulary = new HashMap<>();
        int id = vokabulary.size() + 1;
        vokabulary.put(id, new Words(id, "word", "hjfyfdyttf", "eng"));
    }
}
