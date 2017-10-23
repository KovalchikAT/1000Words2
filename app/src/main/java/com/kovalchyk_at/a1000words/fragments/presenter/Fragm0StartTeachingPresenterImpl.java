package com.kovalchyk_at.a1000words.fragments.presenter;

import android.app.Fragment;
import android.app.FragmentManager;

import com.kovalchyk_at.a1000words.Test0;

/**
 * Created by Kovalchyk_at on 19.10.2017.
 */

public class Fragm0StartTeachingPresenterImpl implements FragmNPresenter{
    private Fragment activity;
    private FragmentManager fragmentManager;

    public Fragm0StartTeachingPresenterImpl(Fragment activity, FragmentManager fragmentManager) {
        this.activity = activity;
        this.fragmentManager = fragmentManager;
    }

    @Override
    public Fragment getTest(int i) {
        return new Test0();
    }
}
