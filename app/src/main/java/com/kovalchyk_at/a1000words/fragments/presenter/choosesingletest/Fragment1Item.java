package com.kovalchyk_at.a1000words.fragments.presenter.choosesingletest;

/**
 * Created by Kovalchyk_at on 11.10.2017.
 */

public class Fragment1Item {
    private String itemName;
    private int itemImg;

    public Fragment1Item(String itemName, int itemImg) {
        this.itemName = itemName;
        this.itemImg = itemImg;
    }

    public String getItemName(){return itemName;}

    public int getItemImg(){return itemImg;}
}
