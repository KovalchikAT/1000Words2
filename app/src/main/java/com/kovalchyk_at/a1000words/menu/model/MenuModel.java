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
        tmp.put(new Integer(0), new Words(0, "tree", "trē", new ArrayList<Integer>(Arrays.asList(1)), new ArrayList<Integer>(Arrays.asList(2, 5)), "eng"));
        tmp.put(new Integer(1), new Words(1, "дерево", "derevo", new ArrayList<Integer>(Arrays.asList(0)), new ArrayList<Integer>(Arrays.asList(3, 4)), "ua"));
        tmp.put(new Integer(2), new Words(2, "oak", "ōk", new ArrayList<Integer>(Arrays.asList(3)), new ArrayList<Integer>(Arrays.asList(0, 5)), "eng"));
        tmp.put(new Integer(3), new Words(3, "дуб", "dub", new ArrayList<Integer>(Arrays.asList(2)), new ArrayList<Integer>(Arrays.asList(1, 4)), "ua"));
        tmp.put(new Integer(4), new Words(4, "береза", "bereza", new ArrayList<Integer>(Arrays.asList(5)), new ArrayList<Integer>(Arrays.asList(1, 3)), "ua"));
        tmp.put(new Integer(5), new Words(5, "birch", "bərch", new ArrayList<Integer>(Arrays.asList(4)), new ArrayList<Integer>(Arrays.asList(0, 2)), "eng"));
        tmp.put(new Integer(6), new Words(6, "car", "kär", new ArrayList<Integer>(Arrays.asList(7, 8)), new ArrayList<Integer>(), "eng"));
        tmp.put(new Integer(7), new Words(7, "автомобіль", "avtomobilʹ", new ArrayList<Integer>(Arrays.asList(6)), new ArrayList<Integer>(Arrays.asList(8)), "ua"));
        tmp.put(new Integer(8), new Words(8, "машина", "mashyna", new ArrayList<Integer>(Arrays.asList(6)), new ArrayList<Integer>(Arrays.asList(7)), "ua"));
        tmp.put(new Integer(9), new Words(9, "ваза", "vaza", new ArrayList<Integer>(Arrays.asList(10)), new ArrayList<Integer>(), "ua"));
        tmp.put(new Integer(10), new Words(10, "vase", "väz", new ArrayList<Integer>(Arrays.asList(9)), new ArrayList<Integer>(), "eng"));
        tmp.put(new Integer(11), new Words(11, "програма", "prohrama", new ArrayList<Integer>(Arrays.asList(12)), new ArrayList<Integer>(), "ua"));
        tmp.put(new Integer(12), new Words(12, "program", "ˈprōˌgram", new ArrayList<Integer>(Arrays.asList(11)), new ArrayList<Integer>(), "eng"));
        tmp.put(new Integer(13), new Words(13, "телефон", "telefon", new ArrayList<Integer>(Arrays.asList(14)), new ArrayList<Integer>(), "ua"));
        tmp.put(new Integer(14), new Words(14, "phone", "fōn", new ArrayList<Integer>(Arrays.asList(13)), new ArrayList<Integer>(), "eng"));
        return tmp;
    }

}
