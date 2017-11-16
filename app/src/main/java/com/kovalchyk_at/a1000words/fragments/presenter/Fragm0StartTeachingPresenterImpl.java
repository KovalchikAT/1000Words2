package com.kovalchyk_at.a1000words.fragments.presenter;

import android.app.Fragment;
import android.app.FragmentManager;

import com.kovalchyk_at.a1000words.tests.Test0;

import java.util.Random;

/**
 * Created by Kovalchyk_at on 19.10.2017.
 */

public class Fragm0StartTeachingPresenterImpl implements FragmNPresenter{
    private Fragment activity;
    private FragmentManager fragmentManager;

    public Fragm0StartTeachingPresenterImpl(Fragment activity) {
        this.activity = activity;
        this.fragmentManager = activity.getFragmentManager();
    }

    public Fragment getRandomChild() {
        Random rand = null;
        int max = 2;
        int min = 0;

        return getChildFragment(rand.nextInt(max - min));
    }

    @Override
    public Fragment getChildFragment(int id) {

        switch (id) {
            case 0:
                return new Test0();
            case 1:
                break;
            default://show error
                return null;
        }
        return null;
    }

    @Override
    public FragmentManager getFragmentManager() {
        return fragmentManager;
    }
}
