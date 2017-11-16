package com.kovalchyk_at.a1000words.fragments.presenter;

import android.view.View;

import com.kovalchyk_at.a1000words.fragments.model.Fragment1ChooseSingleTestModel;
import com.kovalchyk_at.a1000words.fragments.presenter.choosesingletest.Fragment1RecyclerViewAdaptter;

/**
 * Created by Kovalchyk_at on 31.10.2017.
 */

public class Fragment1ChooseSingleTestPresenter {
    private View fragment;
    private Fragment1ChooseSingleTestModel model;

    public Fragment1ChooseSingleTestPresenter(Fragment1ChooseSingleTestModel model, View retView) {
        this.model = model;
        this.fragment = retView;
    }

    public Fragment1RecyclerViewAdaptter getLibraryList() {
        Fragment1RecyclerViewAdaptter rcAdapter = new Fragment1RecyclerViewAdaptter(fragment.getContext(), model.getListItemData());
        return rcAdapter;
    }
}
