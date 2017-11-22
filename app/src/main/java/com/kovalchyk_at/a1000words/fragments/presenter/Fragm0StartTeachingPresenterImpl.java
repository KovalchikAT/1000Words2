package com.kovalchyk_at.a1000words.fragments.presenter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;

import com.kovalchyk_at.a1000words.menu.model.MenuModel;
import com.kovalchyk_at.a1000words.tests.Test0;
import com.kovalchyk_at.a1000words.tests.Test1;

import java.util.Random;

/**
 * Created by Kovalchyk_at on 19.10.2017.
 */

public class Fragm0StartTeachingPresenterImpl implements FragmNPresenter {
    private Fragment activity;
    private FragmentManager fragmentManager;
    private MenuModel model;
    private Bundle b;

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
    public Fragment getChildFragment(int id) {

        switch (id) {
            case 0:
                Log.d("MainActivity", "case 0");
                return fragmentN(b, new Test0());
            default://show error
                Log.d("MainActivity", "case def");
                return fragmentN(b, new Test1());
        }
    }

    @Override
    public FragmentManager getFragmentManager() {
        return fragmentManager;
    }

    private Fragment fragmentN(Bundle b, Fragment fragm) {
        fragm.setArguments(b);
        return fragm;
    }
}
