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

    public HashMap<Integer, Words> getVokabulary() {
        return vokabulary;
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
        tmp.put(new Integer(1), new Words(1, "tree", "trē", new ArrayList<Integer>(Arrays.asList(2)), new ArrayList<Integer>(Arrays.asList(3, 6))));
        tmp.put(new Integer(2), new Words(2, "дерево", "derevo", new ArrayList<Integer>(Arrays.asList(1)), new ArrayList<Integer>(Arrays.asList(4, 5))));
        tmp.put(new Integer(3), new Words(3, "oak", "ōk", new ArrayList<Integer>(Arrays.asList(4)), new ArrayList<Integer>(Arrays.asList(1, 6))));
        tmp.put(new Integer(4), new Words(4, "дуб", "dub", new ArrayList<Integer>(Arrays.asList(3)), new ArrayList<Integer>(Arrays.asList(2, 5))));
        tmp.put(new Integer(5), new Words(5, "береза", "bereza", new ArrayList<Integer>(Arrays.asList(6)), new ArrayList<Integer>(Arrays.asList(2, 4))));
        tmp.put(new Integer(6), new Words(6, "birch", "bərch", new ArrayList<Integer>(Arrays.asList(5)), new ArrayList<Integer>(Arrays.asList(1, 3))));
        return tmp;
    }

}
