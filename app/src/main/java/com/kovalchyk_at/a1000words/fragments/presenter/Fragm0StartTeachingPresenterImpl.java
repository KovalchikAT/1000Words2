package com.kovalchyk_at.a1000words.fragments.presenter;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import com.kovalchyk_at.a1000words.menu.model.MenuModel;
import com.kovalchyk_at.a1000words.tests.Test0;

import java.util.Random;

/**
 * Created by Kovalchyk_at on 19.10.2017.
 */

public class Fragm0StartTeachingPresenterImpl implements FragmNPresenter {
    private Fragment activity;
    private FragmentManager fragmentManager;
    private MenuModel model;
    private Bundle b;

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public Fragm0StartTeachingPresenterImpl(MenuModel menuModel, Fragment activity) {
        this.model = menuModel;
        this.activity = activity;
        this.fragmentManager = activity.getFragmentManager();
        b = new Bundle();
        b.putParcelable("model", menuModel);
    }

    public Fragment getRandomChild() {
        Random rand = new Random();
        int max = 2;
        int min = 0;
        return getChildFragment(rand.nextInt(max - min));
    }

    @Override
    public int[] getCounterAnswer(Fragment fragm) {
        return new int[0];
    }

    @Override
    public Fragment getChildFragment(int id) {
        Fragment fragm;
        switch (id) {
            case 0:
                Log.d("MainActivity", "case 0");
                fragm = new Test0();
                fragm.setArguments(b);
                return fragm;
            default://show error
                Log.d("MainActivity", "case def");
                fragm = new Test0();
                fragm.setArguments(b);
                return fragm;
        }
    }

    @Override
    public FragmentManager getFragmentManager() {
        return fragmentManager;
    }

}
