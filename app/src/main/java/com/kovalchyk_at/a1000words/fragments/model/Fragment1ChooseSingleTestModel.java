package com.kovalchyk_at.a1000words.fragments.model;

import android.view.View;

import com.kovalchyk_at.a1000words.R;
import com.kovalchyk_at.a1000words.fragments.presenter.choosesingletest.Fragment1Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kovalchyk_at on 31.10.2017.
 */

public class Fragment1ChooseSingleTestModel {
    private View fragment;

    public Fragment1ChooseSingleTestModel(View retView) {
        this.fragment = retView;
    }

    public List<Fragment1Item> getListItemData() {
        List<Fragment1Item> listViewItems = new ArrayList<Fragment1Item>();
        listViewItems.add(new Fragment1Item("Alkane", R.drawable.ic_menu_camera));
        listViewItems.add(new Fragment1Item("Ethane", R.drawable.abc_ic_star_black_36dp));
        listViewItems.add(new Fragment1Item("Alkyne", R.drawable.ic_menu_gallery));
        listViewItems.add(new Fragment1Item("Benzene", R.drawable.ic_start));
        listViewItems.add(new Fragment1Item("Amide", R.drawable.ic_menu_manage));
        listViewItems.add(new Fragment1Item("Amino Acid", R.drawable.abc_ic_star_black_36dp));
        listViewItems.add(new Fragment1Item("Phenol", R.drawable.ic_menu_send));
        listViewItems.add(new Fragment1Item("Carbonxylic", R.drawable.ic_start));
        listViewItems.add(new Fragment1Item("Nitril", R.drawable.ic_menu_share));
        listViewItems.add(new Fragment1Item("Ether", R.drawable.ic_start));
        listViewItems.add(new Fragment1Item("Ester", R.drawable.ic_menu_slideshow));
        listViewItems.add(new Fragment1Item("Alcohol", R.drawable.ic_start));

        return listViewItems;
    }
}
