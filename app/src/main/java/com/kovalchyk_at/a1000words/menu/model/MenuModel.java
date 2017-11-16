package com.kovalchyk_at.a1000words.menu.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.kovalchyk_at.a1000words.MenuActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Kovalchyk_at on 08.11.2017.
 */

public class MenuModel implements Parcelable {
    public static final Creator<MenuModel> CREATOR = new Creator<MenuModel>() {
        @Override
        public MenuModel createFromParcel(Parcel in) {
            return new MenuModel(in);
        }

        @Override
        public MenuModel[] newArray(int size) {
            return new MenuModel[size];
        }
    };
    private MenuActivity menuActivity;
    private HashMap<Integer, Words> vokabulary;

    public MenuModel(MenuActivity menuActivity) {
        this.menuActivity = menuActivity;
        this.vokabulary = initData();
    }

    protected MenuModel(Parcel in) {

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    protected HashMap<Integer, Words> initData() {
        HashMap<Integer, Words> tmp = new HashMap<>();
        tmp.put(1, new Words(1, "tree", "trē", "eng", new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 6))));
        tmp.put(2, new Words(2, "дерево", "derevo", "ua", new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6))));
        tmp.put(3, new Words(3, "oak", "ōk", "eng", new ArrayList<Integer>(Arrays.asList(2, 1, 4, 5, 6))));
        tmp.put(4, new Words(4, "дуб", "dub", "ua", new ArrayList<Integer>(Arrays.asList(2, 3, 1, 5, 6))));
        tmp.put(5, new Words(5, "береза", "bereza", "ua", new ArrayList<Integer>(Arrays.asList(2, 3, 4, 1, 6))));
        tmp.put(6, new Words(6, "birch", "bərch", "eng", new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 1))));
        return tmp;
    }
}
