package com.kovalchyk_at.a1000words.fragments.presenter;

import android.app.Fragment;
import android.app.FragmentManager;

/**
 * Created by Kovalchyk_at on 19.10.2017.
 */

public interface FragmNPresenter {
    Fragment getChildFragment(int id);

    FragmentManager getFragmentManager();

    Fragment getRandomChild();
}
